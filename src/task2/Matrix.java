package task2;

import java.util.Random;

public class Matrix {
    private final int M;
    private final int N;
    private final double[][] data;


    public Matrix(int M, int N) {
        this.M = M;
        this.N = N;
        data = new double[M][N];
    }

    public Matrix(double[][] data) {
        M = data.length;
        N = data[0].length;
        this.data = new double[M][N];
        for (int i = 0; i < M; i++)
            System.arraycopy(data[i], 0, this.data[i], 0, N);
    }

    public static Matrix randomMatrix(int M, int N) {
        Matrix A = new Matrix(M, N);
        Random rnd = new Random();
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                A.data[i][j] = rnd.nextInt(9) + 1;
        return A;
    }

    public static String doesSumEqualsDigit(Matrix matrix, int digit) {
        for (int i = 0; i < matrix.M; i++) {
            for (int k = 0; k < matrix.N; k++){
                for (int j = 0; j < matrix.N - 1; j++) {
                    if (matrix.data[i][k] + matrix.data[i][j + 1] == digit) {
                        return "There is a sum in array";
                    }
                }
            }

        }
        return "There is no sum in array";
    }


    public static void show(Matrix matrix) {
        for (int i = 0; i < matrix.M; i++) {
            for (int j = 0; j < matrix.N; j++)
                System.out.printf("%9.2f ", matrix.data[i][j]);
            System.out.println();
        }
        System.out.println("\n");
    }


}

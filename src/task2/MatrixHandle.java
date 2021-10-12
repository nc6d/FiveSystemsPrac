package task2;

import java.util.Scanner;

public class MatrixHandle extends Matrix {

    public MatrixHandle(int M, int N) {
        super(M, N);
    }

    static final class MatrixDimensions {
        private final int rows;
        private final int cols;

        public MatrixDimensions(int rows, int cols) {
            this.rows = rows;
            this.cols = cols;
        }

        public int getRows() {
            return rows;
        }

        public int getCols() {
            return cols;
        }
    }

    public static MatrixDimensions getDimensions() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of cols: ");
        int cols = sc.nextInt();

        return new MatrixDimensions(rows, cols);
    }

    public static int getSumToCheck() {
        System.out.println("Enter your number to check sum in array: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static void main(String[] args) {
        MatrixDimensions md = getDimensions();
        Matrix matrix = randomMatrix(md.getRows(), md.getCols());
        show(matrix);
        System.out.println(doesSumEqualsDigit(matrix, getSumToCheck()));
    }


}

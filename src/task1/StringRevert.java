package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class StringRevert {

    public static void main(String[] args) throws IOException {
        userHandle();
    }

    private static void userHandle() throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter '1' to print string ordinary or '2' to print reversed string");
            String choice = sc.nextLine();
            if (choice != null) {
                if (choice.equals("1")) {
                    System.out.println(userInput());
                    break;
                }
                if (choice.equals("2")) {
                    System.out.println("Reverse with StringBuilder or with a simple algorithm? Press 1 or 2: ");
                    String choice1 = sc.nextLine();

                    if (choice1.equals("1")) {
                        reverseStringWithSB(userInput());
                        break;
                    }
                    if (choice1.equals("2")) {
                        reverseStringInCycle(userInput());
                        break;
                    }
                    System.out.println("Wrong reversion method choice! Try again");
                    continue;


                }
                System.out.println("Wrong output type choice! Try again");
            }

        }
    }
    private static String userInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string: ");
        return br.readLine();
    }

    private static void reverseStringWithSB(String str) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            System.out.println(sb.append(str).reverse());
            return;
        }

        System.out.println("Your string is empty! Try again");
    }

    private static void reverseStringInCycle(String str) {
        if (str != null){
            char[] charArr = str.toCharArray();
            String resultStr = "";
            for (int i = charArr.length - 1; i >= 0; i--) {
                resultStr += charArr[i];
            }
            System.out.println(resultStr);
            return;
        }
        System.out.println("Your string is empty! Try again");


    }
}



package Java_Core_Treuglov_Black_Belt.Tests_for_Game_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tests_1 {
    public static void main(String[] args) {
        int tests_int = 0;
        boolean b1 = true;

// Ввод с проверкой допустимых значений. Удобно с исключениями в этом плане

        while (b1) {
            try {
                Scanner str_scan = new Scanner(System.in); // if I create Scanner before while the cicle becomes infinity; Strange...
                tests_int = str_scan.nextInt();
                try {
                    if (tests_int > 5) {
                        throw new InputMismatchException();
                    } else {
                        b1 = false;
                    }

                } catch (InputMismatchException r) {
                    System.out.println("Enter a value in the range from 1 to 5");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid value entered");
            }
        }
        System.out.println("Good job! str_scan value is: " + tests_int);


    }
}

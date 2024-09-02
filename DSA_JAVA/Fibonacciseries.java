package DSA_JAVA;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms to print in the Fibonacci series:");
        int N = sc.nextInt();

        // Print the first two numbers of the Fibonacci series
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < N; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

        System.out.println(); // For a new line after the series
        sc.close(); // Close the scanner
    }
}

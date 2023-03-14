package javaHomework_Week_6;

import java.util.Scanner;

/**
 * A Java program that takes a number as input and prints its
 * multiplication table up to 10.
 */

public class Program10 {
    public static void multiplicationtable() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to print multiplication table");
        int a = input.nextInt();
        input.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "*" + i + "=" + a * i);
        }

    }

    public static void main(String[] args) {
        multiplicationtable();

    }
}

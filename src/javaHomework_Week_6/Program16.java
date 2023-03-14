package javaHomework_Week_6;

import java.util.Scanner;

/**
 * A Java program to add two binary numbers.
 *
 */

public class Program16 {
    public static void binary(){
        Scanner add = new Scanner(System.in);
        System.out.println("Enter the first binary number");
        String a = add.next();
        System.out.println("Enter the second binary number");
        String b = add.next();
        add.close();
        int a1 = Integer.parseInt(a,2);
        int a2 = Integer.parseInt(b,2);
        int a3 = a1 + a2;
        System.out.println("Addition of two binary number is:"+ Integer.toBinaryString(a3));
    }

    public static void main(String[] args) {
        binary();
    }
}
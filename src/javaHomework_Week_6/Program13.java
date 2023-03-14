package javaHomework_Week_6;

import java.util.Scanner;

/**
 * A Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

public class Program13 {

    public void average(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();

        int avg = (a+b+c)/2;
        System.out.println("Average of three numbers is:" + avg);

    }

    public static void main(String[] args) {
        Program13 obj = new Program13();
        obj.average();
    }
}

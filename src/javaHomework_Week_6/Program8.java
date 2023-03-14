package javaHomework_Week_6;

import java.util.Scanner;

/**
 * A program to calculate the area of a triangle.
 */

public class Program8 {
    public void triangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter height");
        double h = input.nextDouble();
        System.out.println("Please enter width");
        double w = input.nextDouble();
        input.close();
        double ans = (h * w) / 2;
        System.out.println("The area of a triangle is:" + ans);

    }

    public static void main(String[] args) {
        Program8 value = new Program8();
        value.triangle();

    }
}

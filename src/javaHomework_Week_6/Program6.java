package javaHomework_Week_6;

import java.util.Scanner;

/**
 * A program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

public class Program6 {
    public static void circlevalue(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle");
        double r = input.nextDouble(); // Local variable
        input.close();
        double Area = Math.PI * r * r; // Formula
        System.out.println("Area of the circle is:" + Area);
    }

    public static void main(String[] args) {
        circlevalue();
    }
}

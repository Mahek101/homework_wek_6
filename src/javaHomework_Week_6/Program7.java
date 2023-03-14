package javaHomework_Week_6;

import java.util.Scanner;

/**
 * A program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Program7 {
    public static void temperature(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Fahrenheit value");
        float f = input.nextFloat();
        input.close();
        float ans = ((f-32) * 5/9 );
        System.out.println("The degree Celsius value is:" + ans);
    }

    public static void main(String[] args) {
        temperature();
    }



}

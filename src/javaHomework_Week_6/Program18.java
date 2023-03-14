package javaHomework_Week_6;

/**
 * A Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers
 */

public class Program18 {
    static int a = 125;
    static int b = 24;
    static int c = a+b;
    static int d = a-b;
    static int e = a*b;
    static int f = a/b;

    public static void calculations(){
        System.out.println("125 + 24 = " + c);
        System.out.println("125 - 24 = " + d);
        System.out.println("125 x 24 = " + e);
        System.out.println("125/24   = " + f);
        System.out.println("125 mod 24 = " + f);
    }

    public static void main(String[] args){
        calculations();
    }
}

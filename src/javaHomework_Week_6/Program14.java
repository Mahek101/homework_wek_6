package javaHomework_Week_6;

/**
 * A Java program to print the area and perimeter of a rectangle.
 */

public class Program14 {
    static double h = 8.5;
    static double w = 5.6;
    static double area = w*h;
    static double peri = 2*(w+h);
    public static void rectangle(){

        System.out.println("Area is 5.6 * 8.5 ="+ area);
        System.out.println("Perimeter is 2 * (5.6 + 8.5)="+ peri);
    }

    public static void main(String[] args) {
        rectangle();
    }
}

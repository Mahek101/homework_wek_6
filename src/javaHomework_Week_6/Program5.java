package javaHomework_Week_6;
/**
 * A program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.
 */


import java.util.Scanner;
public class Program5 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner create
        System.out.println("Please enter First Number: ");
        int a = scan.nextInt();
        System.out.println("Please Enter The Second Number: ");
        int b = scan.nextInt();
        addition(a,b);
        substraction(a,b);
        Program5 obj = new Program5(); // Object creation
        obj.multiplication(a,b);
        obj.divison(a,b);

        scan.close(); // Scanner close
    }
    public static void addition( int a, int b){
        int z = a + b;
        System.out.println("The Addition Of Two Numbers is:" + z);

        }
        public static void substraction( int a, int b){
        int s = a - b;
            System.out.println("The Substraction Of Two Numbers is:" + s);
        }

        public void multiplication(int a, int b){
        int m = a * b;
            System.out.println("The Multiplication Of Two Numbers is:" + m);
        }

        public void divison(int a, int b){
        int d = a % b;
            System.out.println("The Divison Of Two Numbers is:" + d);
        }

}

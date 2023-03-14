package javaHomework_Week_6;

import java.util.Scanner;

/**
 * A program to convert the upper case to lower case.
 */

public class Program9 {
    public static void uctolc(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter upper case statement to convert");
        String uc = input.nextLine();
        input.close();
        String lc = uc.toLowerCase();
        System.out.println("And a statement in lower case is:" + lc);
    }

    public static void main(String[] args) {
        uctolc();
    }

}

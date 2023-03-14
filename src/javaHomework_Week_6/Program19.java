package javaHomework_Week_6;

/**
 * A Java program to convert a given string into lowercase.
 */

public class Program19 {
    public void uctolc(){
        String str = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String str1 = str.toLowerCase();
        System.out.println(str1);
    }

    public static void main(String[] args) {
        Program19 obj = new Program19();
        obj.uctolc();
    }
}

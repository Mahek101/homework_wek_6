package javaHomework_Week_6;

/**
 * A Java program to swap two variables.
 */
public class Program15 {
    public void swap() {

        int a = 25;
        int b = 52;
        int c = a;
            a = b;
            b = c;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Program15 two = new Program15();
        two.swap();
    }

}

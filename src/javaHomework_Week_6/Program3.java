package javaHomework_Week_6;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program3 {
    int a = 10; // instance variable
    static int b = 20; // static variable

    public void method(){ // instance method
        System.out.println(a);
        System.out.println(b);

    }public static void method2(){ // static method
        Program3 t = new Program3();
        int c = t.a;
       System.out.println(c);
       System.out.println(b);
    }
    public static void main(String[] args) { // main method
        Program3 test1 = new Program3();
        test1.method();
        method2();
    }
}

package javaHomework_Week_6;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4 {
    int a = 2; // instance variable
    int b = 4; // instance variable
    static int c = 6; // static variable
    static int d = 8; // static variable

    public void instance(){ // instance method
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void stat(){ // static method
        Program4 value = new Program4();
        System.out.println(value.a);
        System.out.println(value.b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        Program4 call = new Program4();
        call.instance();
        stat();
    }
}

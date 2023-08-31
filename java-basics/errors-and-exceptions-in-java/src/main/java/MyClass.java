import java.io.IOException;

public class MyClass {
    public static void myMethod() {
        System.out.println("This is myMethod()");
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void myMethod2() {
        System.out.println("This is myMethod2()");
        myMethod();
    }

}

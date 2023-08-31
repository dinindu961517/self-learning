import static java.lang.Math.*; // Static Imports

public class MyClass {
    static int count; // Static Field/Class variable

    static {
        count = 5; // This is the static initializer block
    }

    static int add(int a, int b) {
        return a + b;  // This is a static method
    }

    double area(double radius) {
        return PI * radius * radius; /* Static imports, so we can use PI variable
                                       as it is in this class */
    }

}

class Outer {
    static class Inner {

    }
}

class OuterDemo {
    class InnerDemo {

    }
}

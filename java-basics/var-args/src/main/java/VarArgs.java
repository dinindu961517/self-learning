import java.util.ArrayList;
import java.util.Scanner;

public class VarArgs {
    static {
        System.out.println("Hello I am static initializer");
    }
    static public void myMethod1(String[] args) {
        System.out.println("String[] args");
    }
    static public void myMethod2(String []args) {
        System.out.println("String []args");
    }
    static public void myMethod3(String args[]) {
        System.out.println("String[] args");

    }
    static public void myMethod4(String... args) {
        System.out.println("String... args");
        ArrayList<String> arrayList = new ArrayList<>();

    }

    final public void main(String[] args) {
        myMethod2(new String[]{"orange","apple"});
//        myMethod2("orange","appple");
        myMethod2(new String[]{});

        myMethod4("Orange", "apple");
        myMethod4(new String[]{"Orange"});
        myMethod4();
        myMethod4(new String[]{});
    }

}

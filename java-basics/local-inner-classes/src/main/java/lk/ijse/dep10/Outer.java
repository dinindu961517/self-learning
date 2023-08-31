package lk.ijse.dep10;

public class Outer {
    public void methodWithLocalInnerClass() {
        int localVar = 10;

        class LocalInner {
            public void printLocalVar() {
                System.out.println("Local variable: " + localVar);
            }
        }

        LocalInner innerObject = new LocalInner();
        innerObject.printLocalVar();

    }

    public static void main(String[] args) {
        Outer outerObject = new Outer();
        outerObject.methodWithLocalInnerClass();
    }
}

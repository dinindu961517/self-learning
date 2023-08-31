public class Main {
    public static void main(String[] args) {
        A obj1 = () -> System.out.println("One line lambda");
        obj1.methodA();
        System.out.println("-----------------");

        B obj2 = (x) -> {
            System.out.println(x * x);
        };
        obj2.methodB(10);
        System.out.println("-----------------");


        C obj3 = (x, y) -> System.out.println(x + y);
        obj3.methodC(10, 15);
        System.out.println("--------------------");

    }
}
interface A{
    public void methodA();
}

interface B {
    public void methodB(int num);
}

interface C {
    public void methodC(int num1, int num2);
}

public class Demo implements TestInterface {

    public static void main(String[] args) {
        TestInterface obj = new Demo();
        System.out.println(TestInterface.name);
        TestInterface.staticMethod();

    }

    @Override
    public void abstractMethod() {

    }

    @Override
    public void defaultMethod() {
        TestInterface.super.defaultMethod();
    }
}

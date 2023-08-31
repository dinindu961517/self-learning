public class Main {
    public static void main(String[] args) {
            OuterDemo obj1 = new OuterDemo();
        OuterDemo.InnerDemo obj2 = obj1.new InnerDemo();
        //Here you need an outer class object to create object of the inner class

        Outer obj3 = new Outer();
        Outer.Inner obj4 = new Outer.Inner();
        //Here you don't need an outer class to create object of static inner class
    }
}

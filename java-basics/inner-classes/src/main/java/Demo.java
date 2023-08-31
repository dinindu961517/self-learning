public class Demo {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.outer);
        outerClass.outerMethod();


        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        /*Inner classes are associated with instances of the outer class,
         so you can't create an object of an inner class without having
         an outer class object. Here's how you can do it:
         */

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        /*Keep in mind that if the inner class is marked as static, you can create an
         object of the inner class without needing an instance of the outer class:
         */

    }
}

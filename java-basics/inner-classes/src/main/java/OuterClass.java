public class OuterClass {
    String outer="outer";

    public void outerMethod() {
        System.out.println("Outer method");
    }

    public class InnerClass {
        String outer = "outer";

        public void outerMethod() {
            System.out.println("Inner Method");
        }
    }

    public static class StaticInnerClass {
        /* static keyword can be only used for inner classes*/
    }


}

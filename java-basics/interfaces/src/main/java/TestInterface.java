public interface TestInterface {
    /* An interface is a collection of abstract methods and constant attributes */

    String name = "Dinindu"; /* Here the variables contains public static final keywords have set implicitly.
                                 You can not use private protected keywords. Since this is defined as final, you can not change later */

    void abstractMethod();
    /* Here the method contain public static abstract keywords. concrete classes the implement
       this interface must implement this method*/
    static void staticMethod() {
        /* static method in a interface is associated with the interface. we can call those methods with directly
        though the interface. We can not override static methods */
        System.out.println("This is a static Method");
        privateStaticMethod();
    }

    default void defaultMethod() {
        /*concrete classes that implement this interface has the option to override this method. If they don't want to
        *  override it they can use this implementation with-out overriding the method*/
        System.out.println("This is a default method");
        staticMethod();
        privateStaticMethod();
        privateNonStaticMethod();
        defaultMethod();
    }
    private void privateNonStaticMethod(){
        /* Interfaces can contain private non-static methods, but they can be used only in this interfaces. We can use
        * both static and non-static private methods in the non-static private interface methods */
        System.out.println("This is a private non-static method");
        privateStaticMethod();
        privateNonStaticMethod();
        staticMethod();
        defaultMethod();
    }
    private static void privateStaticMethod() {
        /* Interfaces can contain private static methods, but they can be used only in this interfaces. We can use
         * only static private methods in the static private interface methods */
        System.out.println("This is a private static method");
        privateStaticMethod();
        staticMethod();
    }


}

public final class FinalClass {
    /*When applied to classes, the final keyword indicates that the class cannot be subclassed or extended by any other class.
    A final class cannot have subclasses, ensuring that the behavior and implementation of the class remain unchanged.   */

    final double PI = 3.14159;
    /*When applied to variables, the final keyword makes the variable a constant, which means its value cannot be changed
    once it has been initialized. A final variable must be initialized during its declaration or in the constructor if it
    is an instance variable. Once initialized, its value remains constant throughout the program.  */

    //final String NAME;  <- Here will occur a compile error, because when you define a final variable you need to initialize it.


    public final void finalMethod() {
        /* When applied to methods, the final keyword prevents the method from being overridden by subclasses.
        A final method cannot be modified or extended by any subclass that inherits it. This ensures that the behavior
         of the method remains the same across all subclasses. */

        final int MAX_VALUE = 100;

        final String NAME;
        /*But for local final variables (constants) you can leave without initializing it. but when you try to use it, compiler
        * will throw an compile error  */
//        System.out.println(NAME); <- compile error


    }
}

public abstract class AbstractClass {

    public String myString;
    /* abstract classes can have variables*/

    /* To define abstract class we must use abstract keyword. An abstract class can not be instantiated */

    public void myMethod() {
        /* abstract classes can contain non-abstract methods */
        System.out.println("This is myMethod()");
    }

    public abstract void abstractMethod();
    /* abstract classes have abstract methods, to implement abstract methods, we can use abstract keyword */




}

public class Car extends Vehicle {

    public static void myMethod(short x, float y, float w, float z) {
        System.out.println("1");
    }

    public static void myMethod(int x, float y, double w, float z) {
        System.out.println("2");
    }
    public static void myMethod(short x, float y, double w, float z) {
        System.out.println("3");
    }
    public static void myMethod(short x, short y, int w, float z) {
        System.out.println("4");
    }
    public static void main(String[] args) {
        byte myByte = 12;
        short myShort = 45;
        int myInt = 400;
        float myFloat = 122.5f;
        myMethod(myByte,myShort,myInt,myFloat);
    }
}

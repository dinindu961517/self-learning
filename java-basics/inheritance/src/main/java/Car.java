public class Car extends Vehicle{
    static {
        System.out.println("Car's static Initializer()");
    }
    {
        System.out.println("Car's instance Initializer()");
    }
    public int x;
    public Car() {
        System.out.println("Car()");
    }

//    public Car(int x) {
//        this.x = x;
//        System.out.println("Car(int x)");
//    }

}

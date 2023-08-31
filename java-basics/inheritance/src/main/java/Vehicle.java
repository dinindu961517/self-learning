public class Vehicle {
    private String doors="doors";
    int clutch=2;
    static {
        System.out.println("Vehicle's static initializer()");
    }

    {
        System.out.println("Vehicle's instance Initializer()");
    }

    public Vehicle(int x) {
        System.out.println("Vehicle()");
    }

    public Vehicle() {
    }

    public static void applyBreaks() {
        System.out.println("applyBreaks()");
    }
    public void applyGear() {
        System.out.println("applyGears()");
    }

    private void applyHorn() {
        System.out.println("applyHorns()");
    }
}

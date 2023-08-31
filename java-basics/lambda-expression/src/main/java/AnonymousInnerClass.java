public class AnonymousInnerClass {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle() {
            @Override
            public void drive() {
                System.out.println("Anonymous Inner Class");

            }
        };
        vehicle.drive();
    }
}

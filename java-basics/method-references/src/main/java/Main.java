public class Main {
    public static void main(String[] args) {
        String myStr = "Dinindu";
        Vehicle vehicle = () -> myStr.toUpperCase();
        System.out.println(vehicle.drive());

        Vehicle vehicle1=myStr::toLowerCase;
        System.out.println(vehicle1.drive());
    }
}

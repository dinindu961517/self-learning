public class Demo {
    public static void main(String[] args) {
        Car car = new Car("Ferrari", "hybrid", 660);
        car = null;
        System.out.println(car);
    }
}

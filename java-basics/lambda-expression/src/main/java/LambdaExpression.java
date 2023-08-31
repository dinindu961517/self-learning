public class LambdaExpression {
    public static void main(String[] args) {
        Vehicle vehicle= ()->{
            System.out.println("This is lambda expression");

        };
        vehicle.drive();
    }
}

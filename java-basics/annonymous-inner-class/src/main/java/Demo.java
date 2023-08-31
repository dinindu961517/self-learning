public class Demo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle() {
            public void show() {
                System.out.println("Annonymous inner class");
            }
        };

        vehicle.show();

        Vehicle vehicle1 = new Vehicle();
        vehicle1.show();


        AbstractClass ac=new AbstractClass() {
            @Override
            public void show() {
                System.out.println("Abstract Class Method");
            }
        };
        ac.show();

        Car car =new Car(){
            public void show(){
                System.out.println("Hi");
            }
        };
        car.show();

    }
}

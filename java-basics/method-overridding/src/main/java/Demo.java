public class Demo {
    public static void main(String[] args) {
        Vehicle car1 = new Car();
        Car car2 = new Car();

//        System.out.println(car1.carName); //Compiler can not find carName in car1
//        System.out.println(car1.vehicleName);
//        System.out.println(car2.carName);
//        System.out.println(car2.vehicleName);

//        car2.applyBreak();
//        car1.applyBreak();


        Vehicle obj1 = new Vehicle();
        Vehicle obj2 = new Car();
        Vehicle obj3 = new Prius();

        obj1.applyBreak();
        obj2.applyBreak();
        obj3.applyBreak();


        Vehicle prius1 = new Prius();
        Car prius2 = new Prius();
        Prius prius3 = new Prius();

        System.out.println(prius1.vehicleName);
        System.out.println(prius2.carName);
        System.out.println(prius3.);

    }
}

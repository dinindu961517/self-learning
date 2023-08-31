public class OrdinaryWay {
    public static void main(String[] args) {
        WagonR wagonR = new WagonR();
        wagonR.drive();

    }

}

class WagonR implements Vehicle {

    @Override
    public void drive() {
        System.out.println("This is the ordinary way");
    }
}

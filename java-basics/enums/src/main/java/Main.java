import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = Laptop.Macbook;
        System.out.println(laptop);

        System.out.println(laptop.getPrice());
        laptop.setPrice(2500);
        System.out.println(laptop.getPrice());

        System.out.println(Arrays.toString(Laptop.values()));
    }
}

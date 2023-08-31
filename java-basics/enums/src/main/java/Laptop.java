import java.lang.reflect.Constructor;

public enum Laptop {
    Macbook(2000),XPS(2200),Notebook, ThinkPad(1800);

    private int price;

    private Laptop() {
        System.out.println("NoArg Constructor()");

    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("Constructor()");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

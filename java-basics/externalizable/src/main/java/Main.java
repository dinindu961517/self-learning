import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.txt"));

        Prius myCar = new Prius("Pri", "xl-220", "red");

        oos.writeObject(myCar);
        System.out.println("Serialize Object: "+myCar);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car.txt"));

        Prius car =(Prius) ois.readObject();
        System.out.println("Deserialized Object: "+car+car.getColor());

    }
}

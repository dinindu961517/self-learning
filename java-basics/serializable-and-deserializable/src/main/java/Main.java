import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Vehicle vehicle = new Vehicle("Caravan", "XL-550", "Red");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("vehicle.txt"));
        oos.writeObject(vehicle);
        System.out.println("Serialized Object: "+vehicle);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("vehicle.txt"));
        Vehicle van =(Vehicle) ois.readObject();
        System.out.println("Deserialized Object: "+van);
    }
}

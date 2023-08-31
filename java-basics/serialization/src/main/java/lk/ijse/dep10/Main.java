package lk.ijse.dep10;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("vehicle.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Vehicle vehicle = new Vehicle();

        oos.writeObject(vehicle);

        oos.close();
        System.out.println("----------------");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("vehicle.txt"));

        Vehicle vehicle1 = (Vehicle) ois.readObject();
        System.out.println("Deserialized Object: " + vehicle1);

        ois.close();
    }
}

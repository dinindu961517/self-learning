package lk.ijse.dep10;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car prius = new Car();
        prius.setColor("Gray");
        prius.setModel("GL-205");
        Car.setCapacity(2000);
        Van kdh = new Van("2017", "White");

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("text.txt"));
//        oos.writeObject(prius);
//        oos.writeObject(kdh);
//        System.out.println("Serialized Objects: " + prius);
//        System.out.println("Serialized Objects:"+kdh);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("text.txt"));
        Car myCar = (Car) ois.readObject();
        Van myVan = (Van) ois.readObject();
        System.out.println("Deserialized Objects: " + myCar);
        System.out.println("Deserialized Object :" +myVan);
    }
}

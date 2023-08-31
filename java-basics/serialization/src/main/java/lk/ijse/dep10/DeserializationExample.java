package lk.ijse.dep10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("books");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Book restoredBook = (Book) ois.readObject();
        System.out.println("Deserialized object: "+restoredBook);

    }
}

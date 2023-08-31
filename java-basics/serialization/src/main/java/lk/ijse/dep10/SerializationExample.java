package lk.ijse.dep10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("books");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Book book1 = new Book("Alchemist", "Paulo Coelo");

        oos.writeObject(book1);
        System.out.println("Serialized object: "+book1);
    }
}

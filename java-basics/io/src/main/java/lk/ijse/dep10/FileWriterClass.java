package lk.ijse.dep10;

import javax.annotation.processing.Filer;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("newfile.txt");
        String data = "\n THis is a new data";
        writer.write(data);
        writer.close();
    }
}

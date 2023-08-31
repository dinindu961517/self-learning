package lk.ijse.dep10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("newfile.txt");
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = reader.read();
            if (read==-1) break;
            sb.append((char) read);


        }
        System.out.print(sb);

    }
}

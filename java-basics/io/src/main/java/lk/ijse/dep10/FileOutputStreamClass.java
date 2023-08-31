package lk.ijse.dep10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamClass {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("newfile.txt",true);
        //By default FOS will replace content, if you want to append the data, you need to pass the second parameter as "true"
        String date = "I am 27 years old";
        byte[] bytes = date.getBytes();
        fos .write(bytes);
        fos.close();

        FileInputStream fis = new FileInputStream("newfile.txt");
        while (true) {
            byte[] buffer = new byte[4];
            int read = fis.read(buffer);
            if (read==-1) break;
            System.out.print(new String(buffer));

        }
    }
}

package lk.ijse.dep10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamClass {
    public static void main(String[] args) throws IOException {
        File file = new File("newfile.txt");


        //First Method
        if (file.exists()) {
            FileInputStream fis = new FileInputStream("newfile.txt");
            byte[] bytes = fis.readAllBytes();
            System.out.println(new String(bytes));
            fis.close();
        }else System.out.println("File not exist");
        System.out.println("--------");

        //Second Method
        if (file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            while (true) {
                byte[] buffer = new byte[10];
                int read = fis.read(buffer);
                if (read==-1) break;
                System.out.print(new String(buffer));

            }
            fis.close();
        }else System.out.println("File not exist");
        System.out.println();
        System.out.println("------");


        //Third Method
        if (file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            while (true) {
                int read = fis.read();
                if (read==-1) break;
                char c = (char) read;
                System.out.print(c+"");
            }
            fis.close();

        }



    }
}

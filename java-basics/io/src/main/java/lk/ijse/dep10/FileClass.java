package lk.ijse.dep10;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileClass {
    public static void main(String[] args) throws IOException {
        //To create a new file
        File newFile = new File("newfile.txt");
        boolean fileCreated = newFile.createNewFile();

        //To creat a new Directory
        File newDirectory = new File("newDir");
        boolean dirCreated = newDirectory.mkdir();

        //Checking the existence and properties
        File file = new File("newfile.txt");
        boolean exists = file.exists();
        boolean isDirectory = file.isDirectory();
        long fileSize = file.length();

        System.out.println("Does newfile.txt file exist : " + exists);
        System.out.println("Does newfile.txt a directory : " + isDirectory);
        System.out.println("What is the size of newfile.txt: " + fileSize);

        //Listing the files and directories
        File directory = new File("../io");
        boolean isExist = directory.exists();
        String[] filesInDir = directory.list(); //List the names of the files and directories
        File[] fileObjectInDir = directory.listFiles(); //List File Objects

        System.out.println(Arrays.toString(filesInDir));

        //Deleting Files and Directories
        File fileToDelete = new File("fileToDelete.txt");
        fileToDelete.createNewFile();
        System.out.println(fileToDelete.exists());
        fileToDelete.delete();
        System.out.println(fileToDelete.exists());
        System.out.println("---------------");


        //Renaming Files and Directories
        File oldFile = new File("oldfile.txt");
        oldFile.createNewFile();
        File newName = new File("newfile.txt");
        System.out.println(oldFile.exists());
        oldFile.renameTo(newName);
        System.out.println(oldFile.exists());
        System.out.println(newName.exists());


        //File Paths
        File absoluteFile = new File("/home/Desktop/absolutePathFile.txt");
        File relativeFile = new File("relativePathFile.txt"); // create the file in the file path

//        absoluteFile.createNewFile();
        relativeFile.createNewFile();




    }

}

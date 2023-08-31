package lk.ijse.dep1;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your name: ");
        int age = scanner.nextInt();

        System.out.println("Hello, "+name+"! You are "+age+" years old");
        scanner.close();

        //Scanner class has got the methods of nextLine(), nextInt(), nextDouble(), next(), hasNext(), close()
    }
}

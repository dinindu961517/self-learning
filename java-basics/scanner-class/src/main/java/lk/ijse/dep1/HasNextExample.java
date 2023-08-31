package lk.ijse.dep1;

import java.util.Scanner;

public class HasNextExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter anything: ");
        while (scanner.hasNext()) {
            String myStr = scanner.next();
            System.out.println(myStr);
        }
    }
}

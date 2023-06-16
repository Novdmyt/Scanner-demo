package Scanner;

import java.util.Scanner;

public class Scanner05 {
    static String title;
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        title = "Enter ID: ";
        System.out.print(title);
        int id = scanner.nextInt();

        scanner.nextLine();
        title ="Enter phone: ";
        System.out.print(title);
        String phone = scanner.nextLine();

        System.out.println("Id is " + id + " and phone is " + phone);

        scanner.close();


    }
}

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


    }
}

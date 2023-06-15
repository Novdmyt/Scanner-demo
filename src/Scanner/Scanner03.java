package Scanner;

import java.util.Locale;
import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        System.out.printf("Name: %s Age: %d Height: %.2f%n", name, age, height);

        scanner.close();
    }
}

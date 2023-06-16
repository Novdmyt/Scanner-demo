package Scanner;

import java.util.Scanner;

public class Scanner06 {
    static Scanner scanner;
    static String[] names;
    static int count;
    static int quota;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        System.out.println("Enter number of names: ");
        quota = scanner.nextInt();

        scanner.nextLine();

        names = new String[quota];

        System.out.println("Insert names:");
        for (int i = 0; i < quota; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.println("The list of names:");
        for (int i = 0; i < quota; i++) {
            count++;
            System.out.printf("%d) %s%n", count, names[i]);//означа формат printf
        }

        scanner.close();
    }
}

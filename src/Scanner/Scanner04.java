package Scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = number1 + number2;

        System.out.print("Result is " + sum);

        scanner.close();
    }

}

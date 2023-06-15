package Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("The number is " + number);
        sc.close();
    }



}

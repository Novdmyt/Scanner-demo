package Scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        System.out.printf("The number is %d", num);
        in.close();
    }
}

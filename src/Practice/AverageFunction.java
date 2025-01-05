package Practice;

import java.util.Scanner;

public class AverageFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number :");
        int x = input.nextInt();
        int a = 0;
        int b = 0;

        for (int i = 0; i < x; i++) {
            System.out.println("Number " + (i + 1));
            a += input.nextInt();
        }
        b += a / x;

        System.out.println("Your " + x + " Number's Average number is : " + b);
    }
}

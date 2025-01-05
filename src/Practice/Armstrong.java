package Practice;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num = input.nextInt();
        int sum = 0;
        int temp;
        int r;

        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;
        }
        if (num == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}

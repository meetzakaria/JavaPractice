package Practice;

import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter Number : ");
        n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print(i +" ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println(sum);
    }
}

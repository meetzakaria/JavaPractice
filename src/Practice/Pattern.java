package Practice;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = input.nextInt();

        for (int row = 1;row<=n; row++){
            for (int col = 1; col <=row; col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
}

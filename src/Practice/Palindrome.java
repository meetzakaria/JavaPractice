package Practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sum = 0;
        int temp;
        int r;
        System.out.println("Enter Number : ");
        num = input.nextInt();

        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        //System.out.println(sum);

        if (num == sum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}

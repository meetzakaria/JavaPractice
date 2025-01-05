package Practice;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter your number : ");
        num = input.nextInt();

        if (num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}

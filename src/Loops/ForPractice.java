package Loops;

import java.util.Scanner;

public class ForPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        for(int i = 0; i<5; i++){
            if(n%2==0){
                System.out.println( n );
            }
        }
    }
}

package Recursion;

import java.util.Scanner;

public class RecursionTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int x = input.nextInt();

        System.out.println();

        Factorial a = new Factorial();
        int b = a.fact(10);
        System.out.println(b);

    }
    public static int fact(int n){
        if (n ==1){
            return 1;
        }else {
            return n *fact(n -1);
        }
    }
}

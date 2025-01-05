package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of disks :");
        int n = input.nextInt();

        System.out.println("The Moves are :");
        movedisks(n, 'A', 'B', 'C');
    }

    public static void movedisks(int n , char fromTower, char toTower, char auxTower){
        if (n==1)
            System.out.println("Move disk " +n+ " from "+fromTower+" to "+toTower);
        else {
            movedisks(n-1,fromTower,auxTower,toTower);
            System.out.println("Move disks "+n+" from "+fromTower+" to "+toTower);
            movedisks(n-1,auxTower,toTower,fromTower);
        }
    }
}

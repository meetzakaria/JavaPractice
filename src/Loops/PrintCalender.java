package Loops;

import java.util.Scanner;

public class PrintCalender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Full year: ");
        int year = input.nextInt();

        System.out.println("Enter Month (1-12): ");
        int month = input.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter a value between 1 and 12.");
        } else {
            printMonth(year, month);
        }

        input.close();
    }

    public static void printMonth(int year, int month) {
        System.out.println("\t\t" + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // Print the body of the calendar
        printMonthBody(year, month);
    }

    public static String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid Month"; // Default case added
        }
    }

    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        // Print blank spaces before the first day
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print the days in the month
        for (int i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3; // January 1, 1800 was a Wednesday (3rd day)
        int totalNumberOfDays = getTotalNumberOfDays(year, month);
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;

        // Count total days from 1800 to the given year
        for (int i = 1800; i < year; i++) {
            total += isLeapYear(i) ? 366 : 365;
        }

        // Add days for the months in the given year
        for (int i = 1; i < month; i++) {
            total += getNumberOfDaysInMonth(year, i);
        }

        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0; // Invalid month
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
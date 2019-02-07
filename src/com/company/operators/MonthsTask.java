package com.company.operators;

        import java.util.Scanner;

public class MonthsTask {
    public static void main(String[] args) {
        final String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number [1,12] to get month name ");
        String line = in.nextLine();

        int number = 0;
        if (!isInteger(line)) {
            System.out.println("Your entered string is not a number");
            return;
        } else {
            number = Integer.parseInt(line);
        }

        if (number < 0 || number > 13) {
            System.out.println("Your number doesn't below to [1,12]");
            return;
        } else {
            System.out.println("Your month is " + months[number - 1]);
        }
    }

    public static boolean isInteger(String string) {
        try {
            Integer.parseInt(string);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}

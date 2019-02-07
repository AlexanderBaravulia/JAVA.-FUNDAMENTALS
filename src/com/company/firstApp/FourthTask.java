package com.company.firstApp;

import java.util.Scanner;

public class FourthTask {

    private static final String CURRENT_PASSWORD = "12345";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your password ");
        String string = in.nextLine();
        in.close();
        if (string.equals(CURRENT_PASSWORD)){
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is not correct. Try again.");
        }
    }
}

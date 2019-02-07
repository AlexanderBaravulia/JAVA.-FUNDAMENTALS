package com.company.firstApp;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your name ");
        String string = in.nextLine();

        System.out.printf("Hello "+string);
        in.close();
    }
}

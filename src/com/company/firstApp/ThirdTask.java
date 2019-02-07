package com.company.firstApp;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = in.nextInt();
        in.close();
        int[] mass = new int[num];
        for (int i=0; i<mass.length; i++){
            mass[i]= (int)(Math.random()*100);
            System.out.println(mass[i]);
        }
        for (int i=0; i<mass.length; i++){
            System.out.print(mass[i]+" ");
        }

    }
}



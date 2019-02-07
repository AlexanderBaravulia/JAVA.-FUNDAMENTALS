package com.company.operators;

import java.util.Scanner;

public class IncludeNumberInterval {
    public static void main(String[] args) {

        getInterval(15, -6,15);
    }

    public static void getInterval(int targetNumber, int minNumber, int maxNumber) {
        if (targetNumber>minNumber && targetNumber<maxNumber){
            System.out.println("'" + targetNumber +"' is in the interval (N;M); [N;M]; [N,M); (N;M]");
        } else if (targetNumber == minNumber){
            System.out.println(targetNumber + " is in the interval [N;M); [N;M]");
        } else  if (targetNumber == maxNumber){
            System.out.println(targetNumber + " is in the interval (N;M]; [N;M]");
        } else System.out.println("K is not in any intervals");

    }
}





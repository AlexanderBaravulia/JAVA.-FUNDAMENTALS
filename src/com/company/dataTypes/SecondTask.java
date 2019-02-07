package com.company.dataTypes;

public class SecondTask {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < i; j++) {
                if (args[j].length() > args[j + 1].length()) {
                    String tmp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}

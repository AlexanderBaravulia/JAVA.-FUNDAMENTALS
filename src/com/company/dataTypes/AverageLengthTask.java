package com.company.dataTypes;

public class AverageLengthTask {

    public static void main(String[] args) {
        int averageLength = getAverageLengthArrayElements(args);
        System.out.println("The average length array is "+averageLength );
        for (int i=0; i<args.length;i++){
            if (averageLength>args[i].length()){
                System.out.println("The number is "+args[i]+" its lenght "+args[i].length());
            }
        }

    }

    public static int getAverageLengthArrayElements(String[] args) {
        int sumLengthArrayElements = 0;
        for (int i=0; i<args.length; i++){
            sumLengthArrayElements += args[i].length();
        }
        return sumLengthArrayElements/args.length;
    }



}

package com.company.dataTypes;

public class FirstTask {

    public static void main(String[] args){
        String maxLengthArg = args[0];
        String minLengthArg = args[0];
        for(int i = 0; i < args.length; i++){
            if(args[i].length() > maxLengthArg.length()){
                maxLengthArg = args[i];
            }
            if(args[i].length() < minLengthArg.length()){
                minLengthArg = args[i];
            }
        }
        System.out.println(minLengthArg + " " + maxLengthArg);
    }
}



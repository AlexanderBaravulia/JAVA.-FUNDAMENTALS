package com.company.dataTypes;

public class UniqueDigitsTask {

    public static void main(String[] args) {

        int[] uniqueNumbersCountArray = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            uniqueNumbersCountArray[i] = countUniqueCharacters(args[i]);
        }

        int elementIndex = getMinElementIndex(uniqueNumbersCountArray);

        for (int i=0; i<args.length; i++) {
            System.out.print(args[i] + " ");
        }

        System.out.println("Number with minimal count of different digits: " + args[elementIndex]);
    }

    public static int getMinElementIndex(int[] array){
        int minElementIndex = 0;
        for (int i = 1; i< array.length; i++){
            if (array[minElementIndex] > array[i]){
                minElementIndex = i;
            }
        }
        return minElementIndex;
    }

    public static int countUniqueCharacters(String input) {
        boolean[] isItThere = new boolean[Character.MAX_VALUE];
        for (int i = 0; i < input.length(); i++) {
            isItThere[input.charAt(i)] = true;
        }

        int count = 0;
        for (int i = 0; i < isItThere.length; i++) {
            if (isItThere[i] == true){
                count++;
            }
        }
        return count;
    }
}

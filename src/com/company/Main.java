package com.company;

public class Main {

    public static void indexOfMax(){
        int maxValue = 0;

        int[] value = new int[5];

        value[0] = 5;
        value[1] = 10;
        value[2] = 8;
        value[3] = 4;
        value[4] = 15;
        for (int i : value) {

            if (maxValue < i ) maxValue = i;
        }
        System.out.println("Max value is: " + maxValue);
    }


    public static void main(String[] args) {
	indexOfMax();
    }
}

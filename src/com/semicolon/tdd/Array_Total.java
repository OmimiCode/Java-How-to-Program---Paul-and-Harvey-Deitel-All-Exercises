package com.semicolon.tdd;

public class Array_Total<total> {


    public double total(int[] array) {
        double total = 0;
        for (int counter = 0; counter < array.length; counter++)
            total += array[counter];
        return total;
    }

    public double average(int[] array) {

        double total=0;
        for (int counter = 0; counter < array.length; counter++){
             total += array[counter];
        }
        return total/array.length;
    }

    public int maximum(int[] array) {
        int maximum = array[0];
        for(int counter = 0; counter<array.length; counter++){
            maximum= Math.max(array[counter],maximum);
        }
        return maximum;

    }


    public int minimum(int[] array) {
        int minimum = array[0];
        for(int counter = 0; counter<array.length; counter++){
            minimum= Math.min(array[counter],minimum);
        }
        return minimum;
    }



  /*  shola, to do this, you need to get the minimum addition
    1a- generate the maximum value
    1b- get total
    2 - subtract the maximum value form the total
    3 - return the total
             repeat REVERSE for Maximum Addition*/


    public int getMaxAddition(int[] array) {
        int total=0;
        int minimum = array[0];
        for(int i = 0; i<array.length; i++){
            minimum= Math.min(array[i],minimum);
            total+=array[i];
        }
        return total-minimum;

    }



    public int getMinAddition(int[] array) {
        int total=0;
        int maximum = array[0];
        for(int i = 0; i<array.length; i++){
            maximum= Math.max(array[i],maximum);
            total+=array[i];
        }
        return total-maximum;

    }


}
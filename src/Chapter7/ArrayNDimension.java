package Chapter7;

import java.util.Arrays;

public class ArrayNDimension {

    public static void main(String[] args) {
        double  [][] array = {
                {0.0,0.1,0.2,0.3},
                {0.4,0.5,0.6,0.7},
                {0.8,0.9,1.0,1.1},
                {1.2,1.3,1.4,1.5},
                {1.6,1.7,1.8,1.9}
        };
        for(int row =0; row < array.length ; row++){
            for(int col =0; col<array[row].length; col++){
                System.out.printf( " %.1f",array[row][col]);
            }
            if (array[row].length == 5){
                System.out.println();
            }
        }
    }

}

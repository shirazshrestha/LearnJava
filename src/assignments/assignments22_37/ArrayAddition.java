package assignments.assignments22_37;

//37. Write a Program to perform for the following task.
/*
1 2 3      4 5 6          5 7  9
4 5 6   +  2 7 8    =     6 12 14
7 8 9      3 1 9         10 9  18
 */

import java.util.Arrays;

public class ArrayAddition {
    public static void main(String[] args) {
        int[][] arrA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arrB = {{4, 5, 6}, {2, 7, 8}, {3, 1, 9}};
        int[][] sum = new int[3][3];

        //sum
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                sum[i][j] =  arrA[i][j] + arrB[i][j];
            }
        }

        //display sum
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

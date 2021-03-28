package assignments.assignments22_37;

//33. Write a Program to display numbers in ascending order in array.

import java.util.Arrays;

public class AscendingOrderInArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 9, 4};

        System.out.println("Before ordering");
        System.out.println(Arrays.toString(arr));

        System.out.println("After ordering in ascending order");

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

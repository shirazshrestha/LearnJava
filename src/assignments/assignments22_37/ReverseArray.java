package assignments.assignments22_37;

//34. Write a program to reverse the element of an array.

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};

        System.out.println("Before reverse");
        System.out.println(Arrays.toString(arr));

        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, --j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("---------------");
        System.out.println("After Reverse");
        System.out.println(Arrays.toString(arr));
    }
}

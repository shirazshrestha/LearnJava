package assignments.assignments22_37;

//32. Write a Program to accept 5 values in an array and display their sum.

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i<arr.length; i++){
            System.out.println("Enter a number: ");
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum of the numbers in the array = " + sum);
    }
}

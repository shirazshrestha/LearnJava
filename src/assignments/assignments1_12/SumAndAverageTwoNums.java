package assignments.assignments1_12;

// 3. Write a program to find sum and average of two numbers input by User (using Scanner class). - March 12, 2021

import java.util.Scanner;

public class SumAndAverageTwoNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        float num1 = input.nextFloat();
        System.out.println("Enter second number: ");
        float num2 = input.nextFloat();

        float sum = num1 + num2;
        float avg = sum / 2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The average of " + num1 + " and " + num2 + " is: " + avg);
    }
}

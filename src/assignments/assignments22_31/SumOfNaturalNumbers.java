package assignments.assignments22_31;

//23. Write a program to print the table of given numbers.

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth number: ");
        int num = input.nextInt();
        System.out.println("The sum of 1 to " + num + "th is: " + sumOfNaturalNumbers(num));
    }

    public static double sumOfNaturalNumbers(int num) {
        double sum = (num * (num + 1)) / 2;
        return sum;
    }
}

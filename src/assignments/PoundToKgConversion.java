package assignments;

// 9. Write a program that converts pounds into kg.
// The program prompts the user to enter a number of pounds, converts it to kg and displays the result [1 pound is 0.454 kg]. - March 12, 2021

import java.util.Scanner;

public class PoundToKgConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        float pound = input.nextFloat();

        float kg = (float) (pound * 0.454);
        System.out.println(pound + "Pounds = " + kg + " kgs.");
    }
}

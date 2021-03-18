package assignments.assignments1_12;

// 4. Write a program to calculate Simple Interest input by the user. Simple Interest = P*T*R/100 - March 12, 2021

import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Principal: ");
        float p = input.nextFloat();
        System.out.println("Enter Time: ");
        float t = input.nextFloat();
        System.out.println("Enter Rate in %: ");
        float r = input.nextFloat();

        float simpleInterest = (p * t * r) / 100;
        System.out.println("Simple Interest Charged = " + simpleInterest);
    }
}

package assignments.assignments1_12;

// 12. Write a program to accept the roll, name, and nationality of the person and display those values in good format. - March 12, 2021

import java.util.Scanner;

public class PersonDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter roll no.: ");
        int roll = input.nextInt();
        input.nextLine();
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter nationality: ");
        String nationality = input.nextLine();

        System.out.println("\nWelcome " + name + " (Roll No. " + roll + "). You are a proud " + nationality + ".");
    }
}

package assignments.assignments13_21;

//13. Write a program to print the number entered by the user only if the number entered is negative.

import java.util.Scanner;

public class PrintNegative {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if (isNegative(num)){
            System.out.println(num + " is negative.");
        }
    }

    public static boolean isNegative(int num){
        if(num < 0)
            return true;
        return false;
    }
}

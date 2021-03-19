package assignments.assignments13_21;

//14. Write a program to relate two integers entered by the user using = =or > or < sign.

import java.util.Scanner;

public class RelateTwoIntegers {
    public static void main(String[] args) {
        takeInput();
    }

    public static void takeInput(){
        Scanner input = new Scanner((System.in));

        System.out.println("Enter num1: ");
        int num1 = input.nextInt();

        System.out.println("Enter num2: ");
        int num2 = input.nextInt();

        System.out.println(compare(num1, num2));
    }

    public static String compare(int num1, int num2){
        String result;
        if (num1 == num2) {
            result = num1 + " and " + num2 + " are equal.";
        } else if (num1 > num2) {
            result = num1 + " is greater than " + num2;
        } else {
            result = num1 + " is smaller than " + num2;
        }
        return result;
    }
}

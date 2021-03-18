package assignments.assignments1_12;

// 8. Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit. - March 12, 2021

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Choose your option: ");
        System.out.println("1. Fahrenheit to Celcius");
        System.out.println("2. Celcius to Fahrenheit");
        System.out.println("\nChoose your option (1-2)? ");
        int choice = input.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter temperature in Fahrenheit: ");
                float f1 = input.nextFloat();
                float c1 = (float) ((f1 - 32.0) * 0.5556);
                System.out.println(f1 + " F = " + c1 + " C." );
                break;
            case 2:
                System.out.println("Enter temperature in Celcius: ");
                float c2 = input.nextFloat();
                float f2 = (float)((c2 * 1.8) + 32.0);
                System.out.println(c2 + " C = " + f2 + " F.");
                break;
            default:
                System.out.println("Please choose either option 1 or 2.");
        }
    }
}

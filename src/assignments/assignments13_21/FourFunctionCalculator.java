package assignments.assignments13_21;

//20. Write a program to create the equivalent of a four-function calculator.
// The program to enter two integer’s numbers and an operator. It then carries out the specified arithmetic operator operation:
// addition, subtraction, multiplication or division of the two numbers. Finally, it displays the result.

import java.util.Scanner;

public class FourFunctionCalculator {
    public static void main(String[] args) {
         calculator();
    }

    public static void calculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = input.nextInt();
        System.out.println("Enter num2: ");
        int num2 = input.nextInt();

        System.out.println("\nChoose your option: \n1. + \n2. - \n3. * \n4. /");
        System.out.println("Enter your choice (1-4): ");
        char choice = input.next().charAt(0);

        calculate(choice, num1, num2);
    }

    public static void calculate(int choice, int num1, int num2) {
        switch (choice) {
            case '+':
                System.out.println("Sum = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Difference = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Product = " + (num1 * num2));
                break;
            case '/':
                System.out.println("Quotient = " + (num1 / num2));
                break;
            default:
                System.out.println("Enter valid character.");
        }
    }
}

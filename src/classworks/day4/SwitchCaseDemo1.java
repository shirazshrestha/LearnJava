package classworks.day4;

import java.util.Scanner;

public class SwitchCaseDemo1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1. Add 2. Sub 3. Mul 4. Div");
        int choice = input.nextInt();

        System.out.println("Enter number1: ");
        int a = input.nextInt();
        System.out.println("Enter number2: ");
        int b = input.nextInt();

        switch (choice) { //switch start
            case 1:
                int sum = a + b;
                System.out.println("Sum = " + sum);
                break;
            case 2:
                int sub = a - b;
                System.out.println("Sub = " + sub);
                break;
            case 3:
                int mul = a * b;
                System.out.println("Mul = " + mul);
                break;
            case 4:
                int div = a / b;
                System.out.println("Div = " + div);
                break;
            default:
                System.out.println("Wrong choice!!!");
        } //end of switch

        System.out.println("more code");
        System.out.println("end of program");
    }
}

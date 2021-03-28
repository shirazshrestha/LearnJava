package assignments.assignments22_37;

//24. Write a program to print the factorial number of given numbers.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        Factorial factorial = new Factorial();
        int result = factorial.calculateFactorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }

    //using recursion
    public int calculateFactorial(int num){
        if (num == 0)
            return 1;
        else
            return (num * calculateFactorial(num - 1));
    }
}

package assignments.assignments22_31;

//27. Write a Program to sum each digit of given number as well as product.
// 456 =>4*5*6 and 4+5+6

import java.util.Scanner;

public class SumAndProductOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        SumAndProductOfNumber number = new SumAndProductOfNumber();
        System.out.println("Sum => " + number.sumOfNumber(num));
        System.out.println("Product => " + number.productOfNumber(num));
    }

    public int sumOfNumber(int num){
        int sum = 0;
        int remainder = 0;
        while(num > 0){
            remainder = num % 10;
            sum += remainder;
            num = num / 10;
        }
        return sum;
    }

    public int productOfNumber(int num){
        int product = 1;
        while(num > 0){
            product *= (num % 10);
            num = num / 10;
        }
        return product;
    }

}

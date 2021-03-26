package assignments.assignments22_31;

//26. Write a Program to reverse the given number. 123 => 321

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        ReverseNumber rn = new ReverseNumber();
        int reversed = rn.reverseNumber(num);
        System.out.println(num + " ==> " + reversed);
    }

    public int reverseNumber(int num) {
        int reversed = 0;
        int remainder = 0;
        while (num > 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = num / 10;
        }
        return reversed;
    }
}

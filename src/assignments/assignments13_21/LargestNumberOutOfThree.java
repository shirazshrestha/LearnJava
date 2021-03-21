package assignments.assignments13_21;

//18. Write a program to display the largest number from given three values.

import java.util.Scanner;

public class LargestNumberOutOfThree {
    public static void main(String[] args) {
        takeInput();
    }

    public static void takeInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = input.nextInt();

        System.out.println("Enter num2: ");
        int num2 = input.nextInt();

        System.out.println("Enter num3: ");
        int num3 = input.nextInt();

        int result = compareLargest(num1, num2, num3);
        System.out.println("The largest number is: " + result);
    }

    public static int compareLargest(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                return num1;
            } else {
                return num3;
            }
        }else if(num2 > num1){
            if (num2 > num3){
                return num2;
            } else {
                return num3;
            }
        }else {
            return num3;
        }
    }
}

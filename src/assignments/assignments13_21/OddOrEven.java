package assignments.assignments13_21;

//16. Write a program to find the given number is even or odd.

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if (isEven(num)){
            System.out.println(num + " is even.");
        }else{
            System.out.println(num + " is odd.");
        }
    }

    public static boolean isEven(int num){
        if(num % 2 ==0)
            return true;
        return false;
    }
}

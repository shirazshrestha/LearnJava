package assignments.assignments13_21;

// 15. Write a program that receives an ASCII code (between 0 – 128) and display its character
// [example: 97 (input) ->a(output)].

import java.util.Scanner;

public class ReceiveAsciiDisplayCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ASCII code (0-128): ");
        int ascii = input.nextInt();

        if (ascii >=0 && ascii <= 128){
            char c = (char) ascii;
            System.out.println("ASCII character of " + ascii + " is: " + c);
        }else{
            System.out.println("Input number between 0 and 128.");
        }
    }
}

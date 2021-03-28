package assignments.assignments22_37;

//22. Write a program to print the table of given numbers.

import java.util.Scanner;

public class TableOfGivenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        multipleTable(num);
    }

    public static void multipleTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

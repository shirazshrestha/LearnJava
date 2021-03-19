package assignments.assignments13_21;

//21. Program to input the number of (1...7) and translate to its equivalent name of the day of the week.

import java.util.Scanner;

public class NameOfDayInWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number (1-7): ");
        int day = input.nextInt();
        String dayOfWeek = dayOfWeek(day);
        System.out.println("Day -> " + dayOfWeek);
    }

    public static String dayOfWeek(int num){
        switch(num){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Enter between 1 to 7.";
        }
    }
}

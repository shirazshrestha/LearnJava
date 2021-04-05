package assignments.assignments38_45;

//39. Write a Program to display names in short form. E.g. Ram Kishore Singh  -> R. k. Singh

import java.util.Arrays;
import java.util.Scanner;

public class ShortenName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = input.nextLine();

        ShortenName sn = new ShortenName();
        System.out.println("Your name is: " + sn.shortenName(name));
    }

    public String shortenName(String name){

        String[] arr = name.split(" ");
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < arr.length - 1; i++){
            str.append(arr[i].charAt(0) + ". ");
        }
        return (str.append(arr[arr.length - 1])).toString();

    }
}

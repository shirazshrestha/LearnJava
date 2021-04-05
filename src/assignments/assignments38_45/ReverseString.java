package assignments.assignments38_45;

//40. Write a program to reverse the string.

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.next();

        ReverseString revStr = new ReverseString();
        System.out.println("Reverse of " + word + " is: " + revStr.reverseString(word));
    }

    public String reverseString(String word){
       char[] strArray = word.toCharArray();
        for (int i = 0, j = strArray.length - 1; i < strArray.length / 2; i++, j--){
            char temp = strArray[i];
            strArray[i] = strArray[j];
            strArray[j] = temp;
        }
        return new String(strArray);
    }
}

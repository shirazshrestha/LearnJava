package assignments.assignments38_45;

//38. Write a program to check whether a given string is palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.next();

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(word));
    }

    public boolean isPalindrome(String word){
          boolean isPalindrome = true;
          for (int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--){
              if (word.charAt(i) != word.charAt(j)){
                  isPalindrome = false;
                  break;
              }
          }
          return isPalindrome;
    }
}

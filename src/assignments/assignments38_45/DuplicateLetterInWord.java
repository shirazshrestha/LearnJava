package assignments.assignments38_45;

//41. Write a program to find the duplicate letter in a word.

import java.util.*;

public class DuplicateLetterInWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.next();

        System.out.println("Duplicate Letters in the word " + word + " is: ");
        DuplicateLetterInWord dlw = new DuplicateLetterInWord();
        dlw.printDuplicateLetters(word);
    }

    public void printDuplicateLetters(String word) {
        Map<Character, Integer> duplicate = new HashMap<>();

        for (char c : word.toCharArray()) {
            if (duplicate.containsKey(c)) {
                int counter = duplicate.get(c);
                duplicate.put(c, counter + 1);
            } else {
                duplicate.put(c, 1);
            }
        }

        //print duplicate characters
        for (char c : duplicate.keySet()) {
            if (duplicate.get(c) > 1)
                System.out.print(c + " ");
        }
    }
}

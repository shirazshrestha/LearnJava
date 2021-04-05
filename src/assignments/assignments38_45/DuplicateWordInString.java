package assignments.assignments38_45;

//42. Write a program to find the duplicate word from a long string.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWordInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        DuplicateWordInString dws = new DuplicateWordInString();
        System.out.println("Duplicate words are: ");
        dws.printDuplicateWords(str);
    }

    public void printDuplicateWords(String str) {
        Map<String, Integer> map = new HashMap<>();
        String[] strArray = str.split(" ");

        for (String word : strArray) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        //print duplicate words in a string
        for (String word : map.keySet()) {
            if (map.get(word) > 1)
                System.out.print(word + " ");
        }
    }
}

package assignments.assignments22_37;

//25. Write a program that prompts the user to enter the number of students and each student’s name and score.
// Finally display the student with the highest score

import java.util.*;

public class HighestScoreStudent {

    Map<String, Double> scores = new HashMap<>();

    public static void main(String[] args) {
        HighestScoreStudent hss = new HighestScoreStudent();
        hss.takeInput();
        hss.displayHighest();
    }

    public void takeInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of student(s): ");
        int noOfStudent = input.nextInt();

        for (int i = 0; i < noOfStudent; i++) {
            System.out.println("Enter student's name: ");
            String name = input.next();
            System.out.println("Enter " + name + "'s score: ");
            double score = input.nextDouble();
            scores.put(name, score);
        }
    }

    public void displayHighest() {
       double highestScore = Collections.max(scores.values());
       for (Map.Entry<String, Double> entry : scores.entrySet()){
           if (entry.getValue() == highestScore){
               System.out.println(entry.getKey() + " -> " + highestScore);
           }
        }
    }

}

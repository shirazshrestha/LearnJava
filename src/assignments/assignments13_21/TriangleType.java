package assignments.assignments13_21;

//19. Write a Program to accept three sides of a triangle and display which kind of triangle is formed.

import java.util.Scanner;

public class TriangleType {

    public static void main(String[] args) {
        calculateTriangleType();
    }

    public static void calculateTriangleType(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        int side1 = input.nextInt();
        System.out.println("Enter side 2: ");
        int side2 = input.nextInt();
        System.out.println("Enter side 3: ");
        int side3 = input.nextInt();

        String result = compareTraingleSides(side1, side2, side3);
        System.out.println("The triangle is a " + result);
    }

    public static String compareTraingleSides(int side1, int side2, int side3){
        if (side1 == side2 || side2 == side3){
            if (side1 == side3){
                return "Equilateral Triangle";
            }
            return "Isosceles Triangle";
        }
        return "Scalene Triangle";
    }


}

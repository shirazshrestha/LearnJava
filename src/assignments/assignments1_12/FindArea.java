package assignments.assignments1_12;

// 5. Write a program to find the area of a circle, rectangle, and triangle. - March 12, 2021

import java.util.Scanner;

public class FindArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("##### AREA OF CIRCLE #####");
        final double PI = Math.PI;
        System.out.println("Enter radius of a circle: ");
        double radius = input.nextDouble();
        double areaOfCircle = PI * radius * radius;
        System.out.println("Area of Circle: " + areaOfCircle);
        System.out.println("##########################");

        System.out.println("##### AREA OF RECTANGLE #####");
        System.out.println("Enter length of a rectangle: ");
        double length = input.nextDouble();
        System.out.println("Enter breadth of a rectangle: ");
        double breadth = input.nextDouble();
        double areaOfRectangle = length * breadth;
        System.out.println("Area of Rectangle: " + areaOfRectangle);
        System.out.println("##########################");

        System.out.println("##### AREA OF TRIANGLE #####");
        System.out.println("Enter base of a triangle: ");
        double base = input.nextDouble();
        System.out.println("Enter height of a triangle: ");
        double height = input.nextDouble();
        double areaOfTriangle = 0.5 * base * height;
        System.out.println("Area of Triangle: " + areaOfTriangle);
        System.out.println("##########################");
    }
}

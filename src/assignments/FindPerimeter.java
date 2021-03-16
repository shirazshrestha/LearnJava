package assignments;

// 6. Write a program to find the perimeter of a circle, triangle, and rectangle. - March 12, 2021

import java.util.Scanner;

public class FindPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("##### Perimeter OF CIRCLE #####");
        final double PI = Math.PI;
        System.out.println("Enter radius of a circle: ");
        double radius = input.nextDouble();
        double perimeterOfCircle = 2.0 * PI * radius;
        System.out.println("Perimeter of Circle: " + perimeterOfCircle);
        System.out.println("##########################");

        System.out.println("##### Perimeter OF RECTANGLE #####");
        System.out.println("Enter length of a rectangle: ");
        double length = input.nextDouble();
        System.out.println("Enter breadth of a rectangle: ");
        double breadth = input.nextDouble();
        double perimeterOfRectangle = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeterOfRectangle);
        System.out.println("##########################");

        System.out.println("##### Perimeter OF TRIANGLE #####");
        System.out.println("Enter base of a triangle: ");
        double base = input.nextDouble();
        System.out.println("Enter side of a triangle: ");
        double side1 = input.nextDouble();
        System.out.println("Enter side of a triangle: ");
        double side2 = input.nextDouble();
        double perimeterOfTriangle = base + side1 + side2;
        System.out.println("Perimeter of Triangle: " + perimeterOfTriangle);
        System.out.println("##########################");
    }
}

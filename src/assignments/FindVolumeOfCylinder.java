package assignments;

// 7. Write a program that reads the radius and length of a cylinder and computes volume. - March 12, 2021

import java.util.Scanner;

public class FindVolumeOfCylinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final double PI = Math.PI;

        System.out.println("Enter radius of cylinder: ");
        double radius = input.nextDouble();
        System.out.println("Enter length of cylinder: ");
        double length = input.nextDouble();

        double volumeOfCylinder = PI * radius * radius  * length;
        System.out.println("The volume of the cylinder is: " + volumeOfCylinder);
    }
}

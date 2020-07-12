/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;
import shape.Triangle;
import shape.TriangleType;

/**
 *
 * @author user
 */
public class TriangleApp {

    public static void main(String[] args) {

        // display program's purposes
        System.out.println("This program will accept 3 positive integers (x, y, and z) and");
        System.out.println("treat these three integers as the lengths of three lines.");
        System.out.println("It then determines whether a triangle can be formed with these three");
        System.out.println("lines, and output the type of the triangle (e.g. acute-angled,");
        System.out.println("right-angled, obtuse-angled, isosceles, and equilateral) if one can");
        System.out.println("be formed, or a triangle cannot be formed.");

        Scanner input = new Scanner(System.in);

        // get first positive integer
        System.out.print("Please enter the first positive integer (> 0): ");
        String inputStr = input.nextLine();
        int first = 0;
        try {
            first = Integer.parseInt(inputStr.trim());
            if (first <= 0) {
                System.err.println("Your input '" + first + "' is not positive!");
                System.exit(1);
            }
        } catch (NumberFormatException ex) {
            System.err.println("Your input '" + inputStr + "' is not an integer!");
            System.exit(2);
        }

        // get second positive integer
        System.out.print("Please enter the second positive integer (> 0): ");
        inputStr = input.nextLine();
        int second = 0;
        try {
            second = Integer.parseInt(inputStr.trim());
            if (second <= 0) {
                System.err.println("Your input '" + second + "' is not positive!");
                System.exit(1);
            }
        } catch (NumberFormatException ex) {
            System.err.println("Your input '" + inputStr + "' is not an integer!'");
            System.exit(2);
        }

        // get third positive integer
        System.out.print("Please enter the third positive integer (> 0): ");
        inputStr = input.nextLine();
        int third = 0;
        try {
            third = Integer.parseInt(inputStr.trim());
            if (third <= 0) {
                System.err.println("Your input '" + third + "' is not positive!");
                System.exit(1);
            }
        } catch (NumberFormatException ex) {
            System.err.println("Your input '" + inputStr + "' is not an integer!'");
            System.exit(2);
        }

        // all three inputs are positive integers
        // check whether a triangle can be formed
        if (!Triangle.isTriangle(first, second, third)) {
            System.out.println("A triangle cannot be formed using " + first + ", " + second
                    + ", and " + third + " as side lengths!");
            System.exit(0);
        }

        // a triangle can be formed
        Triangle t001 = new Triangle(first, second, third);
        TriangleType type001 = t001.getTriangleType();

        System.out.println("A triangle with three sides of length " + first + ", " + second
                + ", and " + third + " is " + type001.getLongDesc() + ".");
    }
}

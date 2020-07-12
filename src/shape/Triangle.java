/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Triangle {

    private int a;
    private int b;
    private int c;
    private TriangleType type;

    public Triangle(int a, int b, int c) {
        int[] temp = {a, b, c};
        Arrays.sort(temp);

        this.a = temp[0];
        this.b = temp[1];
        this.c = temp[2];
        this.type = null;
    }

    /**
     *
     * @param x - the length of one side of a triangle
     * @param y - the length of another side of a triangle
     * @param z - the length of the third side of a triangle
     * @return true - if a triangle can be formed with the 3 sides x,y,z
     *
     */
    public static boolean isTriangle(int x, int y, int z) {
        boolean result = false;

        // Reorder sides lengths: smallest to largest lengths
        int[] temp = {x, y, z};
        Arrays.sort(temp);
        x = temp[0];
        y = temp[1];
        z = temp[2];

        // Check that x,y and z are positive integers
        if (x > 0 && y > 0 && z > 0) {
            // Triangle Rule: a + b > c where a<=b<=c
            if (x + y > z) {
                result = true;
            }
        }
        return result;
    }

    public boolean isAcuteAngled() {
        boolean result = false;
        if (a * a + b * b > c * c) {
            result = true;
        }
        return result;
    }

    public boolean isRightAngled() {
        boolean result = false;
        if (a * a + b * b == c * c) {
            result = true;
        }
        return result;
    }

    public boolean isObtuseAngled() {
        boolean result = false;
        if (a * a + b * b < c * c) {
            result = true;
        }
        return result;
    }

    public boolean isIsosceles() {
        boolean result = false;
        if ((a == b && b != c) || (a != b && b == c)) {
            result = true;
        }
        return result;
    }

    public boolean isEquilateral() {
        boolean result = false;
        if (a == b && b == c) {
            result = true;
        }
        return result;
    }

    public TriangleType getTriangleType() {

        if (type != null) {
            return type;
        }

        // Identify the relevant Triangle Match
        if (this.isEquilateral()) {
            type = TriangleType.EquiT;
        } else if (this.isIsosceles()) {
            type = TriangleType.IsosT;
        } else if (this.isRightAngled()) {
            type = TriangleType.RAT;
        } else if (this.isAcuteAngled()) {
            type = TriangleType.AAT;
        } else if (this.isObtuseAngled()) {
            type = TriangleType.OAT;
        } else {
            System.err.println("Unknown triangle type! Should not be here");
        }
        return type;
    }

}

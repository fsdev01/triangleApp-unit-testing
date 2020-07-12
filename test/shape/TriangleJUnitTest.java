/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// MODIFIED VERSION FOR FINAL SUBMISSION


/**
 *
 * @author user
 */
public class TriangleJUnitTest {

    private static Triangle RAT345;
    private Triangle rat345;

    public TriangleJUnitTest() {
    }

    /** LAB 3 - SECTION
    @BeforeClass
    public static void setUpClass() {
        System.out.println("JUnit 4 - @BeforeClass setUpClass() - create the static triangle object RAT345");
        RAT345 = new Triangle(3, 4, 5);
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("JUnit 4 - @AfterClass tearDownClass() - garbage collect RAT345");
        RAT345 = null;
    }

    @Before
    public void setUp() {
        //System.out.println("JUnit 4 - @Before setUp() - create the triangle object rat345!");
        //rat345 = new Triangle(3, 4, 5);
    }

    @After
    public void tearDown() {
        //System.out.println("JUnit 4 - @After tearDown() - garbage collect rat345!");
        //rat345 = null;
    }

    **/
    
    
    /******************************** UNIT TESTING *******************************/
    
    


    /**
     * JUnit test corresponds to the second test case in Test Plan table
     * TEST CASE 1: A TRIANGLE
     * INPUT DATA: x= 3, y = 4 and z = 5
     * DESCRIPTION:
     *  -  SATISFIES RULE THAT ALL INPUTS  ARE POSITIVE INTEGERS (x > 0, y> 0, z> 0)
     *  -  SATISFIES THE TRIANGLE RULE: a + b > c where a <= b <= c 
     */
    @Test
    public void testIsTriangle001() {
        int x = 3;
        int y = 4;
        int z = 5;
        boolean expected = true;
        boolean actual = Triangle.isTriangle(x, y, z);
        Assert.assertEquals(expected, actual);
    }

    /**
     * TEST CASE 2: NOT A TRIANGLE 
     * INPUT DATA: x= 1, y = 3 and z = 100
     * DESCRIPTION:
     *  -  SATISFIES RULE THAT ALL INPUTS  ARE POSITIVE INTEGERS (x > 0, y> 0, z> 0)
     *  -  FAILS THE TRIANGLE RULE: a + b > c where a <= b <= c 
     */
    @Test
    public void testIsTriangle002() {
        int x = 1;
        int y = 3;
        int z = 100;
        boolean expected = false;
        boolean actual = Triangle.isTriangle(x, y, z);
        Assert.assertEquals(expected, actual);
    }

    /**
     * TEST CASE 3: NOT A TRIANGLE
     * INPUT DATA: x= 1, y = 100 and z = 3
     * DESCRIPTION: MODIFIED VERSION OF TEST CASE 2 - REORDERED INPUTS
     *  -  SATISFIES RULE THAT ALL INPUTS  ARE POSITIVE INTEGERS (x > 0, y> 0, z> 0)
     *  -  FAILS THE TRIANGLE RULE: a + b > c where a <= b <= c 
     *  >  Note that a = 1 , b = 3 and c = 100 
     * 
     */
    @Test
    public void testIsTriangle003() {
        int x = 1;
        int y = 100;
        int z = 3;
        boolean expected = false;
        boolean actual = Triangle.isTriangle(x, y, z);
        Assert.assertEquals(expected, actual);
    }
    
    
    
    
    /**
     * TEST CASE 4: RIGHT ANGLE TRIANGLE
     * DESCRIPTION: a^2+ b^2= c^2 where a<=b<=c
     */
    @Test
    public void testIsRightAngled001() {
        int x = 3;
        int y = 4;
        int z = 5;
        Triangle t1 = new Triangle(x, y, z);
        boolean expected = true;
        boolean actual = t1.isRightAngled();
        Assert.assertEquals(expected, actual);

    }

    /**
     * TEST CASE 5: ACUTE ANGLE TRIANGLE
     * DESCRIPTION: a^2 + b^2 > c^2 where a<=b<=c
     */
    @Test
    public void testIsAcuteAngled001() {
        int x = 5;
        int y = 9;
        int z = 10;
        Triangle t1 = new Triangle(x, y, z);
        boolean expected = true;
        boolean actual = t1.isAcuteAngled();
        Assert.assertEquals(expected, actual);

    }

    /**
     * TEST CASE 6: OBTUSE ANGLE TRIANGLE
     * DESCRIPTION: a^2 + b^2 < c^2 where a<=b<=c
     */
    @Test
    public void testIsObtuseAngled001() {
        int x = 3;
        int y = 4;
        int z = 6;
        Triangle t1 = new Triangle(x, y, z);
        boolean expected = true;
        boolean actual = t1.isObtuseAngled();
        Assert.assertEquals(expected, actual);
    }

    /**
     * TEST CASE 7: EQUILATERAL TRIANGLE
     * DESCRIPTION: a = b = c where a<=b<=c 
     */
    @Test
    public void testIsEquilateral001() {
        int x = 5;
        int y = 5;
        int z = 5;
        Triangle t1 = new Triangle(x, y, z);
        boolean expected = true;
        boolean actual = t1.isEquilateral();
        Assert.assertEquals(expected, actual);

    }

    /**
     * TEST CASE 8: ISOSCELES TRIANGLE
     * DESCRIPTION: (1) a = b and b!=c 
     */
    @Test
    public void testIsIsosceles01() {
        int x = 7;
        int y = 7;
        int z = 9;
        Triangle t1 = new Triangle(x, y, z);
        boolean expected = true;
        boolean actual = t1.isIsosceles();
        Assert.assertEquals(expected, actual);
    }

    /**
     * TEST CASE 9: ISOSCELES TRIANGLE
     * DESCRIPTION: (2) a != b and b = c
     */
    @Test
    public void testIsIsosceles02() {
        int x = 10;
        int y = 13;
        int z = 13;
        Triangle t1 = new Triangle(x, y, z);
        boolean expected = true;
        boolean actual = t1.isIsosceles();
        Assert.assertEquals(expected, actual);
    }

    
    /******************************INTEGRATION TESTING **************************/
    /**
     * TEST CASE 10: EQUILATERAL TRIANGLE 
     * DESCRIPTION: a = b = c 
     * NOTE: getTriangleType() SHOULD RETURN EQUILATERAL TRIANGLE (NOT ACUTE ANGLE)
     */
    @Test
    public void testGetTriangleType001() {
        int x = 5;
        int y = 5;
        int z = 5;
        // Create the triangle object
        Triangle t1 = new Triangle(x, y, z);
        String expected = "EquiT";
        String actual = t1.getTriangleType().toString();
        Assert.assertEquals(expected, actual);
    }
    
    
    /**
     * TEST CASE 11: ISOSCELES TRIANGLE 
     * DESCRIPTION: (2) a != b and b = c
     * NOTE: getTriangleType() SHOULD RETURN ISOSCELES TRIANGLE (NOT ACTUTE ANGLE)
     */
    @Test
    public void testGetTriangleType002() {
        int x = 10;
        int y = 13;
        int z = 13;
        // Create the triangle object
        Triangle t1 = new Triangle(x, y, z);
        String expected = "IsosT";
        String actual = t1.getTriangleType().toString();
        Assert.assertEquals(expected, actual);
    }
    
    
   /**
     * TEST CASE 12: ISOSCELES TRIANGLE 
     * DESCRIPTION: (2) a = b and b != c
     * NOTE: getTriangleType() SHOULD RETURN ISOSCELES TRIANGLE (NOT OBTUSE ANGLE)
     */
    @Test
    public void testGetTriangleType003() {
        int x = 2;
        int y = 2;
        int z = 4;
        // Create the triangle object
        Triangle t1 = new Triangle(x, y, z);
        String expected = "IsosT";
        String actual = t1.getTriangleType().toString();
        Assert.assertEquals(expected, actual);
    }
    

    
    /**
    @Test
    public void elauTestIsAcuteAngled001() {
        System.out.println("In elauTestIsAcuteAngled001");
        boolean expected = false;
        boolean actual = RAT345.isAcuteAngled();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void elauTestIsRightAngled001() {
        System.out.println("In elauTestIsRightAngled001");
        boolean expected = true;
        boolean actual = RAT345.isRightAngled();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void elauTestIsObtuseAngled001() {
        System.out.println("In elauTestIsObtuseAngled001");
        boolean expected = false;
        boolean actual = RAT345.isObtuseAngled();
        Assert.assertEquals(expected, actual);
    }
    **/
}

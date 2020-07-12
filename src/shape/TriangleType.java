/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author user
 */
public enum TriangleType {
    AAT("an acute-angled triangle"), 
    RAT("a right-angled triangle"), 
    OAT("an obtuse-angled triangle"), 
    IsosT("an isosceles triangle"), 
    EquiT("an equilateral triangle");

    private final String longDesc;

    TriangleType(String desc) {
        this.longDesc = desc;
    }

    public String getLongDesc() {
        return longDesc;
    }
}

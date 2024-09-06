package com.example.Figures;

import java.lang.reflect.Field;

public class Triangle extends BaseFigure {
    /*
     * Applications of Heron’s Formula
     * The two major applications of Heron’s formula are:
     * 
     * To find the area of different types of a triangle (when the length of three sides are given)
     * To find the area of a quadrilateral (when the length of all three sides are given)
     * 
     * Heron’s formula, attributed to Heron of Alexandria around 62 CE, is used to calculate the area of a 
     * triangle based on the lengths of its sides. Expressed mathematically, if a, b, and c are the side lengths, 
     * then the area is given by: 
     * Area = A = √{s(s-a)(s-b)(s-c)} where s is the semi-perimeter of the triangle calculated as 
     * s = (a + b + c)/2
     */
    
    
    public double[] sides;

    public Triangle(double[] sides) {
        if (sides.length != 3){
            throw new IllegalArgumentException("A triangle must have exactly three side");
        }
        
        if (!triangleIsValid(sides[0], sides[1], sides[2])){
            throw new IllegalArgumentException("The sum of two sides must be greater to the one left.");
        }
        this.sides = sides;
    }

    @Override
    public double area() {
        double s = perimetro() / 2;
        return Math.sqrt( s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]) );
    }

    @Override
    public double perimetro() {
        double sum = 0;

        for (double side: sides){
            sum = sum + side;
        }
        return sum;
    }
    
    public Field[] getFields() {
        return Triangle.class.getFields();
    }
    
    private boolean triangleIsValid(double sideA, double sideB, double sideC){
        boolean comp1 = sideA + sideB > sideC;
        boolean comp2 = sideA + sideC > sideB;
        boolean comp3 = sideB + sideC > sideA;
        return comp1 && comp2 && comp3;
    }
}
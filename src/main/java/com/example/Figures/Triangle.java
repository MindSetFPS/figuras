package com.example.Figures;

import java.lang.reflect.Field;
import java.util.List;

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
    
    
    public double x, y, z;
    
    public Triangle(){
    }

    @Override
    public double area(List<Double> values) {
        double s = perimetro(values) / 2;
        return Math.sqrt( s * (s - values.get(0)) * (s - values.get(1)) * (s - values.get(2)) );
    }

    @Override
    public double perimetro(List<Double> values) {
        return values.get(0) + values.get(1) + values.get(2);
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
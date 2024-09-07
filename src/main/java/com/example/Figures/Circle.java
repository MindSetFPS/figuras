package com.example.Figures;

import java.lang.reflect.Field;
import java.lang.Math;
import java.util.List;

public class Circle extends BaseFigure {
    public double radio;
    
    public Circle() {
    }

    public double area(List<Double> values) {
        return Math.PI * values.get(0);
    }

    public double perimetro(List<Double> values) {
        return 2 * Math.PI * values.get(0);
    }
    
    public Field[] getFields(){
       return Circle.class.getFields(); 
    }

}

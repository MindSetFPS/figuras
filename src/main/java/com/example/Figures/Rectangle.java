package com.example.Figures;

import java.lang.reflect.Field;
import java.util.List;

public class Rectangle extends BaseFigure {
    
    public double base, height;

    public Rectangle(){
        // this.base = base;
        // this.height = height;
    }

    @Override
    public double area(List<Double> values) {
        return values.get(0) * values.get(1);
    }
    
    @Override
    public double perimetro(List<Double> values) {
        return (values.get(0) * 2) + (values.get(1) * 2);
    }
    
    public Field[] getFields() {
        return Rectangle.class.getFields();
    }
}

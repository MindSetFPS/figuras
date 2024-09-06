package com.example.Figures;

import java.lang.reflect.Field;

public class Rectangle extends BaseFigure {
    
    public double base, height;

    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return this.base * this.height;
    }
    
    @Override
    public double perimetro() {
        return (this.base * 2) + (this.height * 2);
    }
    
    public Field[] getFields() {
        return Rectangle.class.getFields();
    }
}

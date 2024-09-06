package com.example.Figures;

import java.lang.reflect.Field;

public class Square extends BaseFigure {
    
    public double side;
    
    public Square(double side){
        this.side = side;
    }
    
    @Override
    public double area() {
        return side * side;
    }
    
    @Override
    public double perimetro() {
        return side * 4;
    }
    
    public Field[] getFields() {
        return Square.class.getFields();
    }
    
}
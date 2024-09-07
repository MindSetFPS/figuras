package com.example.Figures;

import java.lang.reflect.Field;
import java.util.List;

public class Square extends BaseFigure {
    
    public double side;
    
    public Square(){
        // this.side = side;
    }
    
    @Override
    public double area(List<Double> values) {
        return values.get(0) * values.get(0);
    }
    
    @Override
    public double perimetro(List<Double> values) {
        return values.get(0) * 4;
    }
    
    public Field[] getFields() {
        return Square.class.getFields();
    }
    
}
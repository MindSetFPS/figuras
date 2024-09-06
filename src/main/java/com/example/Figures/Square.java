package com.example.Figures;

public class Square extends BaseFigure {
    
    double side;
    
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
    
}
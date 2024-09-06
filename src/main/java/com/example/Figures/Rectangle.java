package com.example.Figures;

public class Rectangle extends BaseFigure {
    
    double base, height;

    Rectangle(double base, double height){
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
}

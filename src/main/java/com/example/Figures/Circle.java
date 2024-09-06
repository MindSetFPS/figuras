package com.example.Figures;

import java.lang.Math;

public class Circle extends BaseFigure {
    public double radio;
    
    public Circle(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.abstractClass.ShapeHierarchy;

/**
 *
 * @author nikolad
 */
public class Triangle extends Shape {
    
    private double a,b,c;
    
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //area = (s1+s2+s3)/2.0d;
    //Math.sqrt(area * (area - a) * (area - b) * (area - c));
    public double getPerimeter() {
        return (a + b + c);
    }
    
    public double getArea() {
        return Math.sqrt(getPerimeter() * (getPerimeter() - a) * (getPerimeter() - b) * (getPerimeter() - c));
    }
    
}

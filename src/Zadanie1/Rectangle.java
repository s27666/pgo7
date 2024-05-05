package Zadanie1;

public class Rectangle implements Figure {


    public double sideA;
    public double sideB;
    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public double getPerimeter(){
        return 2*sideA + 2*sideB;
    }
    public double getArea(){
        return sideA*sideB;
    }
    public String getType(){
        return "Rectangle";
    }
}
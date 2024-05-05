package Zadanie1;

public class Parallelogram implements Figure {
    public double baseSide;
    public double side;
    double height;
    public Parallelogram(double baseSide, double side, double height) {
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }
    public double getPerimeter(){
        return 2*baseSide+2*side;
    }
    public double getArea(){
       return baseSide*height/2;
    }
    public String getType(){
       return "Parallelogram";
    }
}
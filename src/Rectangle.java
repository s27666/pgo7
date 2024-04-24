public class Rectangle implements Figure{


    public double sideA;
    public double sideB;
    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public void getPerimeter(){
        System.out.println(2*sideA + 2*sideB);
    }
    public void getArea(){
        System.out.println(sideA*sideB);
    }
    public void getType(){
        System.out.println("Rectangle");
    }
}

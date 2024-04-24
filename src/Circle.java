public class Circle implements Figure{
    public double radius;
    public Circle(double radius) {
        this.radius = radius;
    }


    public void getPerimeter(){
        System.out.println(2*radius*Math.PI);
    }
    public void getArea(){
        System.out.println(radius*radius*Math.PI);
    }
    public void getType(){
        System.out.println("Circle");
    }
}

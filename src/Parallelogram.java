
public class Parallelogram implements Figure{
    public double baseSide;



    public double side;
    double height;
    public Parallelogram(double baseSide, double side, double height) {
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }
    public void getPerimeter(){
        System.out.println(baseSide*2 + side*2);
    }
    public void getArea(){
        System.out.println(baseSide*height/2);
    }
    public void getType(){
        System.out.println("Parallelogram");
    }
}

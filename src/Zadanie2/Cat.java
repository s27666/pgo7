package Zadanie2;

public class Cat extends Animal implements Moveable{
    public Cat(String name){
        super(name);
    }
    public String getType(){
        return "Cat";
    }
    public void start(){
        System.out.println(getType() + " starts!");
    }
    public void stop(){
        System.out.println(getType() + " stops!");
    }


}

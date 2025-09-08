package Inheritance.Car.Shape;

public class Rect extends Shape {
    private double height;
    private double lenght;
    public Rect(double height,double lenght){
        this.height = height;
        this.lenght = lenght;
    }
    @Override
    public double area(){
        return height*lenght;
    }
    
}

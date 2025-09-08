package Inheritance;

public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("BARK");
    }
    public void Scratch(){
        System.out.println("Scratch");
    } 
}
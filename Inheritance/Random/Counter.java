package Inheritance.Random;
public class Counter {
    private static int count = 0;

    public Counter(){
        count++;
    }
    public static int getCount(){
        return count;
    }
    public static void main(String[] args) {
        Counter C1= new Counter();
        Counter C2=new Counter();
        
        System.out.println(Counter.getCount());
        
    }
}

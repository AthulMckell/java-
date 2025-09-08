public class Dog {
    private String name;
    private String colour;

    public Dog(String name,String colour){
        this.name = name;
        this.colour = colour;
    }
    public static void main(String[] arg){
        Dog mDog = new Dog("Tiger", "black and white spotted");
        System.out.println(mDog.name+""+mDog.colour);
    }
}

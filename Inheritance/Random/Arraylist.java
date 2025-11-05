package Inheritance.Random;
import java.util.ArrayList;
import java.util.Arrays;
public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> Arr = new ArrayList<>(Arrays.asList("Athul","Amy"));
        System.out.println(Arr);
        System.out.println(Arr.get(0));
        Arr.add("Amla");
        System.out.println(Arr);
    }
}

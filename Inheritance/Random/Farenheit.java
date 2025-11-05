package Inheritance.Random;
import java.util.Scanner;
public class Farenheit{
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in farenheit:");
        double farenheit = input.nextDouble();

        double cel = (farenheit-32.0)*(5.0/9.0);
        System.out.println(farenheit+" f = "+cel+" celcius");

    }
}
package Inheritance.Random;
import java.util.Scanner;
public class InchetoMeter {
    public static void main(String[] arg){
        Scanner input =new Scanner(System.in);
        System.out.println("Input the Inches:");
        double inche = input.nextDouble();

        double meter = inche*0.0254;
        System.out.println("Meters:"+meter);

    }
}

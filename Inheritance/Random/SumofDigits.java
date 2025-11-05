package Inheritance.Random;
import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] arg){
       Scanner input = new Scanner(System.in);
       System.out.println("Input a number between 0 and 1000:");
       int num = input.nextInt();
       int n=0;
       do{
            n+=num%10;
            num=num/10;
       }while(num!=0);
       System.out.println("Sum of digits:"+n);
    }
}

import java.util.Scanner;
public class MinstoYears {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the minutes:");
        int min = input.nextInt();
        int years=min/525600;
        int days =(min%525600)/1440;
        System.out.println(years+" years and "+days+" days");
    }
}

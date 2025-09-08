import java.util.Scanner;
class HelloGoodbye{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1 = input.next();
        String name2 = input.next();
        System.out.println("Hello "+ name1+" and"+name2);
        System.out.println("Goodbye "+name2+" and "+name1);
    }
}
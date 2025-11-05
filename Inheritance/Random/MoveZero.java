package Inheritance.Random;
public class MoveZero {

    public static void printarray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void move(int[] arr){
        int j=0;
        for(int i = 0;i<arr.length; i++)
        {
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ={4,3,0,8,6,0,4};
        printarray(arr);
        move(arr);
        printarray(arr);
    }
}

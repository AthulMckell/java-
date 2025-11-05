package Inheritance.Random;
public class ReverseArray {
    public static int[] reverse(int[] Arr, int start, int end){
        while(start<end){
            int temp = Arr[start];
            Arr[start] = Arr[end];
            Arr[end] = temp;
            start++;end --;
            
        }
        return Arr;
    }
    public static void printarray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] Arr = {2,4,5,6,7,8};
        printarray(Arr);  
        reverse(Arr, 0, Arr.length-1);
        System.out.println("**********************");
        printarray(Arr);
    }
}

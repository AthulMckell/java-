package Inheritance.Random;
public class RemoveElem {
    public static int[] CountElem(int[] arr){
        int count=0;
        for(int i= 0;i<arr.length;i++){
            if(arr[i]%2 != 0)
                count++;
        }
        int[] result = new int[count];
        int idx = 0;
        for(int i= 0;i<arr.length;i++){
            if(arr[i]%2 != 0)
                {
                    result[idx] = arr[i];
                    idx++;
                }
            
    }
    return result;
}
public static void printarray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
public static void main(String[] args) {
    int[] arr ={12,34,2,3,4,5,6};
    int[] result = CountElem(arr);
    printarray(result);
}
}

public class PrintArray{
    public void printArr(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        PrintArray arr1 = new PrintArray();
        arr1.printArr(new int[] {1,4,2,5,3});
    }
}
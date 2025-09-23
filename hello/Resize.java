class Resize{
    public static int[] resize(int[] arr,int cap){
        int[] temp = new int[cap];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        printarray(temp);
        return temp;
    }
    public static void printarray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr ={2,4,1,5};
        arr = resize(arr, 7);
        printarray(arr);
    }
}
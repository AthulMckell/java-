package DS;
class SelectionSort{
    static int[] SelectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min_idx=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
                int temp=arr[i];
                arr[i]=arr[min_idx];
                arr[min_idx]=temp;
            }
        }
        return arr;
    }
    static void printarray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr = {45,76,33,2,55,22};
        printarray(arr);
        printarray(SelectSort(arr));
    }
}
package DS;

class BinarySearch{

    static int BinarySearchs(int[] arr,int x){
        int low=0;
        int high = arr.length-1;
        while (low<=high) {
            int mid= low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]<x){
                low=mid+1;
            }
            if(arr[mid]>x){
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,23,34,44,55,56};
        int x=7;
        int result= BinarySearchs(arr,x);
        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at position "+result);
        }
    }
}
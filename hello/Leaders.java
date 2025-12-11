import java.util.ArrayList;

public class Leaders {
    public static ArrayList lead(int[] arr){
        int n= arr.length;
        ArrayList<Integer> nums = new ArrayList<>();
        int leader = arr[n-1];
        nums.add(leader);
        for(int i=n-2;i>=0;i--){
            if (arr[i]>leader) {
                nums.add(arr[i]);
                leader=arr[i];
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5, 2};
        ArrayList<Integer> Lead= lead(arr);
        System.out.println(Lead);
    }
}

import java.util.HashMap;

public class TwoSum {
    public static int[] TwoSums(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int comp = target-arr[i];
            if(map.containsKey(comp)){
                return new int[] {map.get(comp),i};
            }
         map.put(arr[i],i);

        }
        return new int[]{};
        }
    } 
    public static void main(String[] args) {
        
    }

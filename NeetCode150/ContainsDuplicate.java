package NeetCode150;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean ContDuplicate(int[] nums){
        HashSet<Integer> seenNum = new HashSet<>();

        for(int num: nums){
            if(seenNum.contains(num)){
                return true;
            }
            seenNum.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
       System.out.println(ContDuplicate(nums));
    }
}

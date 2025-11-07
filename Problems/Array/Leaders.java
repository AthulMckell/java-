package Problems.Array;

import java.util.Collections;

import java.util.ArrayList;

public class Leaders {
    static ArrayList<Integer> LeadersOf(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int maxR = arr[n-1];
        result.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxR){
                maxR = arr[i];
                result.add(maxR);
            }
        }
        Collections.reverse(result);
        return result;
    }
    static void printarray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr ={23,55,2,3,5,1};
        printarray(arr);
        ArrayList<Integer> result = new ArrayList<>();
        result = LeadersOf(arr);
        for (int res : result) {
            System.out.print(res + " ");
        }
        System.out.println();
        
    }
    
}

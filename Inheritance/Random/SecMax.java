package Inheritance.Random;
public class SecMax {

    public static int SecMaxElemet(int[] Arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i=0; i<Arr.length; i++ ){
            if(Arr[i]>max){
                secMax = max;
                max = Arr[i];
            }
            else if(Arr[i]>secMax && Arr[i]!=max){
                secMax = Arr[i];
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
        int[] Arr = {2,3,43,4,55,4,44,55,3,4,5};
        System.out.println(SecMaxElemet(Arr));
    }
}

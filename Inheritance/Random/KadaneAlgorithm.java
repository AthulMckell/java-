package Inheritance.Random;
public class KadaneAlgorithm {
    public static int maxSubArraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, -8, 7, -1, 2, 3};
        int[] arr2 = {-2, -4};
        int[] arr3 = {5, 4, 1, 7, 8};

        System.out.println("Max Subarray Sum: " + maxSubArraySum(arr1)); // 11
        System.out.println("Max Subarray Sum: " + maxSubArraySum(arr2)); // -2
        System.out.println("Max Subarray Sum: " + maxSubArraySum(arr3)); // 25
    }
}

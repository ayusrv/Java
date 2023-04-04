//Kadane's Algorithm -> https://leetcode.com/problems/maximum-subarray/description/

import java.util.Scanner;

public class Ar4_MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum =Math.max(arr[i]+sum,arr[i]);
            max = Math.max(sum,max);
        }
        return max;
    }
}

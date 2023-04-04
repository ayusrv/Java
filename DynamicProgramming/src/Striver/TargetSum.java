package Striver;
//Leetcode 4924

import java.util.Arrays;
import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[][] dp = new int[n+1][40020];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(findTargetSumWays(0,arr,target,dp));
    }

    public static int findTargetSumWays(int i, int[] arr, int target, int[][] dp){
        if(target==0 && i==arr.length){
            return 1;
        }
        if(i>arr.length-1){
            return 0;
        }
        if(dp[i][target+20001]!=-1){
            return dp[i][20001];
        }
        int left = findTargetSumWays(i+1,arr,target+arr[i],dp);
        int right = findTargetSumWays(i+1,arr,target-arr[i],dp);
        return dp[i][target+20001] = left+right;
    }
}

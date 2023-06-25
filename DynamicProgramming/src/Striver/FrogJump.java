package Striver;

import java.util.Arrays;
import java.util.Scanner;

public class FrogJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(frogJump(arr, n));
    }

    private static int frogJump(int[] arr, int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,arr,dp);
    }

    private static int solve(int n, int[] arr, int[] dp){
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int left = solve(n-1,arr,dp)+Math.abs(arr[n]-arr[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1) right = solve(n-2, arr, dp) + Math.abs(arr[n] - arr[n-2]);
        return dp[n] = Math.min(left,right);
    }

    private static int solveTabu(int n, int[] arr){
        int[] dp = new int[n+1];
        dp[0] = 0;
        for (int i = 1; i <n ; i++) {
            int fs = dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i>1) ss = dp[i-2]+Math.abs(arr[i]-arr[i-2]);
            dp[i] = Math.min(fs,ss);
        }
        return dp[n-1];
    }

}

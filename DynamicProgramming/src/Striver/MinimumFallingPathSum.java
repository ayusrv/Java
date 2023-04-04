//Leetcode 931
package Striver;

import java.util.Scanner;

public class MinimumFallingPathSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(minFallingPathSum(arr));
    }

    public static int minFallingPathSum(int[][] arr){
        int n = arr.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        int maxi = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.min(maxi,ans(n-1,i,arr,dp));
        }
        return maxi;
    }

    public static int ans(int i, int j, int[][] arr, int[][] dp){
        int n = arr.length;
        if(j<0 || j>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==0){
            return arr[0][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int s = ans(i-1,j,arr,dp)+arr[i][j];
        int ld = ans(i-1,j-1,arr,dp)+arr[i][j];
        int rd = ans(i-1,j+1,arr,dp)+arr[i][j];

        return dp[i][j] = Math.min(s,Math.min(ld,rd));
    }
}

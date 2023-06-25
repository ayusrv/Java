package Striver;

import java.util.Scanner;

public class Knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        int[] wt = new int[n];
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }
        System.out.println(knapSack(w,wt,val,n));
    }

    static int knapSack(int W, int wt[], int val[], int n)
    {
        // your code here
        int[][] dp = new int[n][W+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=W;j++){
                dp[i][j] = -1;
            }
        }

        return solve(n-1, W, wt, val, dp);
    }

    static int solve(int ind, int w, int[] wt, int[] val,int[][] dp){
        if(ind==0){
            if(wt[0]<=w) return val[0];
            else return 0;
        }
        if(dp[ind][w]!=-1) return dp[ind][w];
        int ntake = solve(ind-1, w, wt, val, dp);
        int take = Integer.MIN_VALUE;
        if(wt[ind]<=w) {
            take = val[ind] + solve(ind-1, w-wt[ind], wt, val, dp);
        }
        return dp[ind][w] = Math.max(take, ntake);
    }
}

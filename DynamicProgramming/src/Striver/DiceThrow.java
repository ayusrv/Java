package Striver;

import java.util.ArrayList;
import java.util.Arrays;

public class DiceThrow {
    static long noOfWays(int M , int N , int X) {
        long sum=0;long[][] dp = new long[N+1][X+1];
        for(long[] arr: dp){
            Arrays.fill(arr, -1);
        }
        return solve(N, X, dp, M);
    }

    static long solve(int n, int x, long[][] dp, int m){

        if(x<0) return 0;
        if(n==0) {
            if(x==0) return 1;
            else return 0;
        }
        if(dp[n][x]!=-1) return dp[n][x];
        long sum=0;
        for(int i=1;i<=m;i++){
            sum+=solve(n-1, x-i, dp, i);
        }
        return dp[n][x]=sum;
    }

    public static void main(String[] args) {
        System.out.println(noOfWays(6, 3, 12));
    }
}

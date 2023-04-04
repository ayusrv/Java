package Striver;

import java.util.Arrays;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recfact(n));
    }

    public static int fact(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        if(n==1 || n==0){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n] = fact(n) * fact(n-1);
    }
    public static int ans = 1;
    public static int recfact(int n){
        if(n==1){
            return 1;
        }
        return recfact(n)*recfact(n-1);
    }
}

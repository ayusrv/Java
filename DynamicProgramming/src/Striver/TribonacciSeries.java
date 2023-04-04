package Striver;

import java.util.Scanner;

public class TribonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tribonacci(n));
        System.out.println(tribonacci2(n));
    }

    //Recursion
    public static int tribonacci(int n){
        if(n<=1){
            return n;
        }
        if(n==2){
            return 1;
        }
        return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }

    //DP
    public static int tribonacci2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }
}

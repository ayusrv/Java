package Striver;

import java.util.Scanner;

public class UniquePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(uniquePaths(m,n));
    }

    public static int uniquePaths(int m, int n){
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = 0;
            }
        }
        
        return memo(m,n,dp);
    }

    public static int rec(int m, int n){

        //Step 1 -> Check the base cases
        //Base case to check if m reached the starting index and n reached the starting index
        if(m==0 && n==0){
            return 1;
        }

        //If any of the index has reached outside the box then do not count just return 0
        if(m<0 || n<0){
            return 0;
        }

        //Step 2 explore all the possible paths
        int up = rec(m-1,n);
        int left = rec(m,n-1);

        //Step 3 sum all the ways
        return up+left;
    }

    public static int memo(int m, int n, int[][] dp){
        //Step 1 -> Check the base cases
        //Base case to check if m reached the starting index and n reached the starting index
        if(m==0 && n==0){
            return 1;
        }

        //If any of the index has reached outside the box then do not count just return 0
        if(m<0 || n<0){
            return 0;
        }
        if(dp[m][n]!=0){
            return dp[m][n];
        }

        int  up = memo(m-1,n,dp);
        int left = memo(m,n-1,dp);

        return dp[m][n] = up+left;
    }

    public static int tabu(int m, int n, int[][] dp){
        //Step 1 -> Check the base cases
        //Base case to check if m reached the starting index and n reached the starting index
        if(m==0 && n==0){
            return 1;
        }

        //If any of the index has reached outside the box then do not count just return 0
        if(m<0 || n<0){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }

        int  up = tabu(m-1,n,dp);
        int left = tabu(m,n-1,dp);

        return dp[m][n] = up+left;
    }
}

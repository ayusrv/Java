package Striver;

import java.util.Scanner;

public class MinimumPathSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                dp[i][j] = -1;
            }
        }
        return memo(m-1,n-1,dp,grid);
    }

    public static int memo(int m, int n, int[][] dp, int[][] grid){
        //Step 1 -> Check the base cases
        //Base case to check if m reached the starting index and n reached the starting index
        if(m==0 && n==0){
            return grid[0][0];
        }

        //If any of the index has reached outside the box then do not count just return 0
        if(m<0 || n<0){
            return Integer.MAX_VALUE;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }

        int up = memo(m-1,n,dp,grid)+grid[m][n];
        int left = memo(m,n-1,dp,grid)+grid[m][n];
        dp[m][n] = Math.min(up,left);
        return dp[m][n];
    }
}

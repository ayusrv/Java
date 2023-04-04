package Striver;

import java.util.Arrays;
import java.util.Scanner;

public class CherryPickup2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(cherryPickup(grid));
    }
    public static int cherryPickup(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int dp[][][] = new int[r][c][c];
        for(int[][] rowOne : dp){
            for(int[] rowTwo : rowOne){
                Arrays.fill(rowTwo, -1);
            }
        }

        return f(0, 0, c - 1, grid, dp);
    }

    static int f(int i, int j1, int j2, int[][] grid, int[][][] dp){
        if(j1 < 0 || j1 >= grid[0].length || j2 < 0 || j2 >= grid[0].length) return (int)(Math.pow(-10, 9));
        if(i == grid.length - 1){
            if(j1 == j2) return grid[i][j1];
            else return grid[i][j1] + grid[i][j2];
        }
        if(dp[i][j1][j2] != -1) return dp[i][j1][j2];

        int max = 0;
        for(int dj1 = -1; dj1 <= 1; dj1++){
            for(int dj2 = -1; dj2 <= 1; dj2++){
                if(j1 == j2){
                    max = Math.max(max, grid[i][j1] + f(i + 1, j1 + dj1, j2 + dj2, grid, dp));
                }
                else{
                    max = Math.max(max, grid[i][j1] + grid[i][j2] + f(i + 1, j1 + dj1, j2 + dj2, grid, dp));
                }
            }
        }
        return dp[i][j1][j2] = max;
    }
}

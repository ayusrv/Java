import java.util.Scanner;

//Leetcode 807
public class MaxIncreaseKeepSkyline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum=0;
        int n = grid.length;
        int[] row = new int[grid.length];
        int[] col = new int[grid.length];
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            int max=0;
            for (int j = 0; j < n; j++) {
                max = Math.max(max,grid[i][j]);
                row[i] = max;
            }
        }
        for (int i = 0; i < n; i++) {
            int max=0;
            for (int[] ints : grid) {
                max = Math.max(max, ints[i]);
                col[i] = max;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = Math.min(row[i],col[j])-grid[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum+=ans[i][j];
            }
        }
        return sum;
    }
}

package Striver;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{2},{3,4},{6,5,7},{4,1,8,3}};
        List<List<Integer>> arr1 = new ArrayList<>();
        System.out.println(minimumTotal(arr1));
        List<Integer> l = new ArrayList<>();
//        l.add()
    }

    public static int minimumTotal(List<List<Integer>> arr){
        int n = arr.size();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return ans(arr,n,dp,0,0);
    }

    public static int ans(List<List<Integer>> arr, int n, int[][] dp, int i, int j){
        if(i==n-1){
            return arr.get(n-1).get(j);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int d = arr.get(i).get(j) + ans(arr,n,dp,i+1,j);
        int dg = arr.get(i).get(j) + ans(arr,n,dp,i+1,j+1);

        return dp[i][j] = Math.min(d,dg);
    }
}

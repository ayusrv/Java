import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UniqueBinarySearchTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numTrees(n));
    }

    public static int numTrees(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        return solve(n,arr);
    }

    public static int solve(int n, int[] dp){
        if(n<=1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans+= solve(i-1,dp)+solve(n-i,dp);
        }
        return ans;
    }
}

//Leetcode 560

package Striver;

import java.util.Scanner;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(subarraySum(arr,target,n-1));
    }

    public static int subarraySum(int[] arr, int target, int ind){
        if(target==0){
            return 1;
        }
        if(ind==0){
            if(arr[0] == target){
                return 1;
            }
            else {
                return 0;
            }
        }
        int notTake = subarraySum(arr,target,ind-1);
        int take = subarraySum(arr,target-arr[ind],ind-1);

        return notTake+take;
    }

    public static boolean subsetSumToK(int n, int k, int arr[]) {

        // Declaring dp array.
        boolean dp[][] = new boolean[n + 1][k + 1];

        // If required sum = 0, answer always true.
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // If size of array = 0, answer always false.
        for (int i = 1; i <= k; i++) {
            dp[0][i] = false;
        }

        // Filling dp array.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = dp[i - 1][j];
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        return dp[n][k];
    }
}

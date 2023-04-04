import java.util.Arrays;
import java.util.Scanner;
//Leetcode 1877
public class MinMaxPairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(minPairSum(nums));
    }

    public static int minPairSum(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < n/2; i++) {
            min = Math.max(min,nums[i]+nums[n-1-i]);
        }
        return min;
    }
}

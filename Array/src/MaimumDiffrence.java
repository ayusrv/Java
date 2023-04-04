import java.util.Arrays;
import java.util.Scanner;

public class MaimumDiffrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(minimumDifference(arr,k));
    }

    public static int minimumDifference(int[] nums, int k){
        if (k == 1) return 0;

        Arrays.sort(nums);

        int i = 0, j = k - 1,
                min = Integer.MAX_VALUE;

        while (j < nums.length) {
            min = Math.min(min, nums[j++] - nums[i++]);
        }

        return min;
    }
}

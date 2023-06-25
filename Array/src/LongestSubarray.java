import java.util.ArrayList;
import java.util.Scanner;

public class LongestSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(longestSubarray(arr));
    }

    public static int longestSubarray(int[] nums) {
//        ArrayList<Integer>
        return 0;
    }
}

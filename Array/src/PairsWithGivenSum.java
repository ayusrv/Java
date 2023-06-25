import java.util.Arrays;
import java.util.Scanner;

public class PairsWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int k = sc.nextInt();
//        System.out.println(maxScore(arr, k));
        boolean[] aa = new boolean[4];
        System.out.println(Arrays.toString(aa));
    }

    public static int maxScore(int[] cardPoints, int k) {
        return solve(cardPoints, 0, cardPoints.length-1, k);
    }

    public static int solve(int[] arr, int i, int j, int k){
        if(i==arr.length-1) return arr[i];
        if(j==0) return arr[j];
        if(i>= arr.length) return Integer.MIN_VALUE;
        if(j<0) return Integer.MIN_VALUE;
        if(k==0) return Math.max(arr[i], arr[j]);
        int left = arr[i] + solve(arr,i+1,j,k--);
        int right = arr[j] + solve(arr,i,j-1,k--);
        return Math.max(left, right);
    }
}

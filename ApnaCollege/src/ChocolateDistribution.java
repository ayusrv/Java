import java.util.Arrays;
import java.util.Scanner;

//https://www.geeksforgeeks.org/chocolate-distribution-problem/
public class ChocolateDistribution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(answer(arr));
    }

    public static int answer(int[] arr){
        Arrays.sort(arr);
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i] - arr[i-1];
        }
        arr[0] = Integer.MAX_VALUE;
        Arrays.sort(arr);
        return arr[0];

    }

}

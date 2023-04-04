import java.util.Arrays;
import java.util.Scanner;

//Leetcode 1561
public class MaximumNumberOfCoin
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxCoins(arr));
    }

    public static int maxCoins(int[] arr){
        int maxi=0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length/3; i++) {
            maxi= maxi+arr[arr.length-i];
        }
        return maxi+1;
    }
}

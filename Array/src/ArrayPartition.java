//Leetcode 561

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arrayPairSum(arr));
    }

    public static int arrayPairSum(int[] arr){
        int sum = 0;
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            if(i%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}

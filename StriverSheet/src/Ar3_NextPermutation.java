//https://leetcode.com/problems/next-permutation/description/

import java.util.ArrayList;
import java.util.Scanner;

public class Ar3_NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        nextPermutation(arr);
    }

    public static void nextPermutation(int[] arr){
        if(arr==null || arr.length<=1)
        {
            return;
        }
        else{
            int i = arr.length;
            while (i>=0 && arr[i]>=arr[i+1])i--;
            if(i>=0){
                int j = arr.length;
                while (arr[j]<=arr[i])j--;
                swap(arr,i,j);
            }
            reverse(arr,i, arr.length);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr, int i, int j){
        while (i<j){
            swap(arr,i,j);
        }
    }
}

//https://leetcode.com/problems/sort-colors/

import java.util.Scanner;

public class Ar5_SortColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortColors(arr);
    }
    public static void sortColors(int[] nums) {
        int z=0,o=0,t=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                z++;
            }
            else if(nums[i]==1){
                o++;
            }
            else{
                t++;
            }
        }
        for (int i = 0; i <z; i++) {
            nums[i]=0;
        }
        for (int i = z; i <z+o ; i++) {
            nums[i] = 1;
        }
        for (int i = z+o; i <z+o+t; i++) {
            nums[i]=2;
        }
    }
}

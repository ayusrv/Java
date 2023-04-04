import java.util.Scanner;

//Leetcode 540
public class SingleElementSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        while (s<=e){
            int m = (s+e)/2;
            if(e%4==0){
                if(nums[m]==nums[m+1]){
                    s=m+1;
                }
                else{
                    e=m;
                }
            }
            else{
                if(nums[m]!=nums[m+1]){
                    s=m+1;
                }
                else{
                    e=m;
                }
            }
        }
        return nums[s];
    }
}

import java.util.Scanner;

public class Ar9_MergeSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1 = new int[n+m];
        int[] nums2 = new int[n];
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n)
    {
        if(m==0){
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }
        int ind=0,s=0,e=0;
        while (s<m && e<n){
            forward(nums1,ind);
            if(nums1[s]>nums2[e]){
                nums1[ind]=nums2[e];
                e++;
            }
            else{
                s++;
            }
            ind++;
        }
        if(e<n){
            for (int i = e; i < n ; i++) {
                nums1[m+i-1] = nums2[i];
            }
        }
    }

    public static void forward(int[] arr, int i){
        for (int j = i; j < arr.length-1; j++) {
            arr[i+1] = arr[i];
        }
    }
}

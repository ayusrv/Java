import java.util.Scanner;

public class FindPivot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(pivotIndex(arr));
    }

    public static int pivotIndex(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int sumL=0,sumR=0;
            for (int j = i-1; j>=0; j--) {
                sumL += nums[j];
            }
            for (int j = i+1; j < nums.length; j++) {
                sumR+=nums[j];
            }
            System.out.println(sumL+" "+sumR);
            if(sumR==sumL){
                return i;
            }
        }
        return -1;
    }
}

import java.util.Scanner;

//Lettcode1013
public class PartitionArrayIntoEqualSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] nums = {0,2,1,-6,6,-7,9,1,2,0,1};
        System.out.println(canThreePartsEqualSum(nums));
    }

    public static boolean canThreePartsEqualSum(int[] arr){
        int sum =0;
        for (int j : arr) {
            sum += j;
        }
        if(sum%3!=0) return false;
        sum=sum/3;
        int i=0;
        int c = 0;
        while(i!= arr.length-1){
            int sum1=0;
            while(sum1<sum){
                sum1+=arr[i];
                i++;
            }
            c++;
        }
        return c == 3;
    }
}

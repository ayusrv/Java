import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {10,2,3,4,5,9,7,8};
        int sum = 23;
        System.out.println(foursum(arr,sum));
    }

    public static int foursum(int[] arr, int sum){
        int s=0;
        Arrays.sort(arr);
        int i=0;
        int j= arr.length-1;
        while (i<j){
            s=arr[i]+arr[i+1]+arr[j]+arr[j-1];
            if(s==sum){
                return 1;
            }
            else if(s> sum){
                j--;
            }
            else{
                i++;
            }
        }
        return 0;
    }
}

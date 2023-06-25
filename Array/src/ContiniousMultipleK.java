import java.util.Scanner;

public class ContiniousMultipleK {
    public static void main(String[] args) {
        int[] arr = {11,12,34,2,4};
        int k=6;
        System.out.println(getSum(arr,k));
    }

    public static boolean getSum(int[] arr, int k){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        if(sum%k==0) return true;
        int j= arr.length-1;
        int i=0;
        boolean pick = getVal(arr,k,sum-arr[i],i++,j);
        boolean notPick = getVal(arr,k,sum-arr[j],i,j--);
        return pick || notPick;
    }

    public static boolean getVal(int[] arr, int k, int sum, int i, int j){
        if(i>=j) return false;
        if(sum%k==0) return true;
        return getVal(arr,k,sum-arr[i],i++,j) || getVal(arr,k,sum-arr[j],i,j--);
    }

    //Apply a heap sort to sort the given number of
}

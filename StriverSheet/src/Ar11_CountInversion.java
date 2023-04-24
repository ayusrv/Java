import java.util.Scanner;

public class Ar11_CountInversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
         for(int i=0;i<n;i++){
             arr[i] = sc.nextLong();
         }
        System.out.println(getInversions(arr,n));
    }

    public static long getInversions(long arr[], int n) {
        // Write your code here.
        long[] temp = new long[n];
        long ans = mergeSort(arr,temp, 0, arr.length-1);
        return ans;
    }

    public static long mergeSort(long[] arr, long[] temp, int left, int right){
        int mid;
        long c=0;
        if(right>left){
            mid = (left+right)/2;
            c += mergeSort(arr, temp, left, mid);
            c += mergeSort(arr, temp, mid+1, right);
            c += merge(arr,temp,left,mid+1,right);
        }
        return c;
    }

    public static long merge(long[] arr, long[] temp, int left, int mid, int right){
        int i,j,k;
        long c = 0;
        i = left;
        j = mid;
        k = left;
        while ((i<=mid-1)  && (j<=right)){
            if(arr[i]<=arr[j]){
                temp[k++ ] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
                c = c + (mid-i);
            }
        }

        while (i<=mid-1)
            temp[k++] = arr[i++];

        while (j<=right)
            temp[k++] = arr[j++];

        for(i=left; i<=right; i++){
            arr[i] = temp[i];
        }

        return c;
    }
}

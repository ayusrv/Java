import java.util.Scanner;

public class LowerBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(lb(arr, x, 0, arr.length-1));
    }

    private static int lb(int[] arr, int x, int s, int e){

        int ans = e;
        while (s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>=x){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}

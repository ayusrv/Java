import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

//Logic Building exercise 6
public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(lis(arr));
    }

    public static int lis(int @NotNull [] arr){
        int maxi = 0;
        int n = arr.length;
        if(n==1 || n==0){
            return 0;
        }
        int j=0;
        while(j<n-1) {
            int c=1;
            for (int i = j; i < n - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    c++;
                }
            }
            maxi = Math.max(maxi, c);
            j=j+c;
        }
        return maxi;
    }
}

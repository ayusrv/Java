import java.util.HashMap;
import java.util.Scanner;

public class MaximumSubarrayWithSum0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxLen(arr,n));
    }

    static int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0;
        int i=-1;
        map.put(sum,i);
        int maxl=0;
        while (i<n-1){
            i++;
            sum+=arr[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }else{
                int ind = map.get(sum);
                maxl = Math.max(i-ind,maxl);
            }
        }
        return maxl;

    }

}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    public static int[] twoSum(int[] arr, int target){
        int[] sum = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(target-arr[i])){
                sum[0] = i;
                sum[1] = hm.get(target-arr[i]);
            }
            else{
                hm.put(arr[i],i);
            }
        }
        return sum;
    }
}

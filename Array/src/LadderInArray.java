import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LadderInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(laders(arr,n));
    }

    public static ArrayList<Integer> laders(int[] arr, int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n-1];
        for (int i = n-2; i >=0; i--) {
            if(arr[i]>max){
                max=arr[i];
                ans.add(arr[i]);
            }
        }
        Collections.reverse(ans);
        ans.add(arr[n-1]);
        return ans;
    }
}

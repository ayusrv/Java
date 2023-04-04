import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ConvertArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(findMatrix(arr));
    }

    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }
        while (!(arr.size()==0)){
            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i < arr.size(); i++) {
                hs.add(arr.get(i));
                arr.remove(i);
            }
            List<Integer> l = new ArrayList<>(hs);
            ans.add(l);
        }
        return ans;
    }
}

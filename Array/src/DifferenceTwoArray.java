import java.util.*;

public class DifferenceTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num1 = new int[n];
        int[] num2 = new int[m];
        for (int i = 0; i < n; i++) {
            num1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            num2[i] = sc.nextInt();
        }
        System.out.println(findDifference(num1, num2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> ans1 = new ArrayList<Integer>();
        List<Integer> ans2 = new ArrayList<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for(int i: nums1) set1.add(i);
        for(int i: nums2) set2.add(i);
        for(int i:set1){
            if(!set2.contains(i)){
                ans1.add(i);
            }
        }
        for(int i:set2){
            if(!set1.contains(i)){
                ans2.add(i);
            }
        }
        ans.add(ans1);
        ans.add(ans2);
        return ans;
    }
}

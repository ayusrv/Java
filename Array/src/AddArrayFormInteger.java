//Leetcode 989

import java.util.*;

public class AddArrayFormInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(addToArrayForm(num,k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k){
        List<Integer> ans = new ArrayList<>();
        int val=0;
        int n = num.length;
        int c=0;
        for (int j : num) {
            if (j == 0) {
                val = val * 100;
            } else {
                System.out.println(val);
                val = val * 10 + j;
            }
        }
        val+=k;
        while (val!=0){
            ans.add(val%10);
            val/=10;
        }
        Collections.reverse(ans);
        return ans;
    }
}

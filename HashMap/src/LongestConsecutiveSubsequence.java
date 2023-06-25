//https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(longestConsecutive(arr));
    }

    //arr[] = {10,5,9,1,11,8,6,15,3,12,2}

    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap<>();

        //Phele subko true kr do saari values hm mai saari values ko daale or subko true kr diye
        for(int val: nums){
            hm.put(val,true);
        }

        //aab check krenge agar usse ek km value present hai hm mai to usko false kr do jisse humko starting proint mil jayeaga kidher se subarray bn skta hai
        //example 10 kca check kiya 9 hai usko false kr diye phir 5 ka check kiya 4 nahi hai wo true hai 9 ka check kiya 8 hai false kr diye
        //aab isse humlog ke pass bs starting true bacha hai jaise ki 5,1,8,15
        for(int val: nums){
            if(hm.containsKey(val-1)) hm.put(val,false);
        }
        int ml = 0; //max length

        for(int val:nums){
            if(hm.get(val)==true){
                int tl=1; //total length;
                int tv = val; //get value;

                //now check jb tk value jo hai wo sequence milra hai mp mai tb tk aage badhte jao and length ko calculate krte jao
                while(hm.containsKey(tv)){
                    tl++;
                }
                if(tl>ml){
                    ml=tl;
                }
            }
        }
        return ml;
    }
}

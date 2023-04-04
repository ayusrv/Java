package Striver;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountVowelString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countVowelStrings(n));
    }

    public static int countVowelStrings(int n){
        int ret = 0;
        int[] arr = new int[5];
        Arrays.fill(arr,1);
        for (int i = 2; i <=n; i++) {
            for (int j = 3; j >=0 ; j--) {
                arr[i] = arr[i] + arr[i+1];
            }
        }
        for(int a:arr){
            ret+=a;
        }
        return ret;
    }
}

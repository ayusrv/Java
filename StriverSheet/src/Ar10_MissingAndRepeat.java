import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Ar10_MissingAndRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i, sc.nextInt());
        }
        System.out.println(missingAndRepeating(arr,n));
    }

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n){
        int[] ans = new int[2];
        ans[0] = findRep(arr);
        ans[1] = findMis(arr,ans[0]);
        return ans;
    }

    public static int findRep(ArrayList<Integer> arr){
        int[] ar = new int[arr.size()];
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            ar[i] = arr.get(i);
        }
        for(int i = 0; i < n; i++){
            int idx = abs(ar[i]) - 1;
            if( ar[idx] < 0 ) return idx + 1;
            ar[idx] *= -1;
        }
        return -1;
    }

    public static int findMis(ArrayList<Integer> arr, int repNum) {
        int n = arr.size();
        long currSum = 0;
        long orgSum = n * 1L * (n + 1) / 2;
        for (Integer a : arr) {
            currSum += a;
        }
        currSum -= repNum;
        int misNum = (int) (orgSum - currSum);
        return misNum;
    }
}

//Given 2 array print the common values in arr1 and arr2
//EG arr[1] = {1,1,2,2,2,3,5,} arr2[] = {1,1,1,2,2,4,5} answer -> 1,1,2,2,5

import java.util.HashMap;
import java.util.Scanner;

public class GetCommonElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(arr1[i], hm.getOrDefault(arr1[i],0)+1);
        }

        for (int i = 0; i < m; i++) {
            if(hm.containsKey(arr2[i]) && hm.get(arr2[i])>0){
                System.out.println(arr2[i]);
                hm.put(arr2[i], hm.getOrDefault(arr2[i],0)-1);
            }
        }
    }
}

import java.util.HashMap;
import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        frequencyCount(arr,n,p);
    }

    public static void frequencyCount(int arr[], int n, int p)
    {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < p; i++) {

        }

    }
}

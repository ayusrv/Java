import java.util.Scanner;

public class MinimumNumberOfJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minJumps(arr));
    }
    
    public static int minJumps(int[] arr){
        int n = arr.length;
        int c=0;
        int i=0;
        while (i<n){
            c++;
            i = arr[i];
        }
        return c;
    }
}

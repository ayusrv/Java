import java.util.Arrays;
import java.util.Scanner;

public class negativePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(segregateElements(arr, n)));
    }
    private static int[] solve(int[] arr){
        if(arr.length<=1){
            return arr;
        }
        int ind=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0){
                int temp = arr[ind];
                arr[ind] = arr[i];
                arr[i] = temp;
                ind++;
            }
        }
        return arr;
    }

    public static int[] segregateElements(int arr[], int n)
    {
        // Your code goes here
        int[] ans = new int[n];
        int neg=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0) neg++;
        }
        int cn=0, cp=0;
        if(neg==n || neg==0) return arr;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                ans[cn++] = arr[i];
            }
            else{
                ans[neg+cp] = arr[i];
                cp++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i] = ans[i];
        }
        return arr;
    }

}


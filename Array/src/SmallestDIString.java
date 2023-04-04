import java.util.Arrays;
import java.util.Scanner;

public class SmallestDIString {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        String s = sc.next();
        System.out.println(smallestNumber(s));
    }

    public static String smallestNumber(String s){
        int n = s.length();
        char[] arr = new char[n+1];
        for (int i = 0; i <= n; i++) {
            arr[i] = ((i+1)+"").charAt(0);
        }
        for (int i = 0; i < n; i++) {
            int j = i;
            while(j>=0 && s.charAt(j)=='D'){
                swap(arr,j,j+1);
                j--;
            }
        }
        return String.valueOf(arr);
    }

    public static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

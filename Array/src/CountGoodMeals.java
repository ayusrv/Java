import java.util.*;

//Leetcode 1711
public class CountGoodMeals {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countPairs(arr));
    }

    public static int countPairs(int[] arr){
        int c=0;
        int i=1;
        Arrays.sort(arr);
        int[] t = Arrays.copyOf(arr,arr.length);
        for (int j = 0; j < arr.length-1; j++) {
            if(arr[j]==arr[j+1]){
                i++;
            }
            else{
                c = (i*(i-1))/2 + c;
                System.out.println(c);
                i=1;
            }
        }
        if(c==0){
            c = (i*(i-1))/2;
        }
        return c;
    }

    public static boolean isPowerOfTwo(int n)
    {
        double v = Math.log(n) / Math.log(2);
        return (int)(Math.ceil(v))
                == (int)(Math.floor(v));
    }
}


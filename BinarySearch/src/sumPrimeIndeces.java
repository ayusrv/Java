import java.util.ArrayList;
import java.util.Arrays;

public class sumPrimeIndeces {
    public static void main(String[] args) {
        int[] array = {-1, -2, -3, 3, 4, -7};
//        int sum = f(array);
//        System.out.println("Sum of values at prime indices: " + sum);
//        int[] a = {43, 345, 20, 987};
//        System.out.println(Arrays.toString(f(a)));
        int[] arr = new int[1];
        sumOfSSum(582109, arr);
        System.out.println(arr[0]);
    }


    private static void sumOfSSum(int n, int[] arr){
        if(n<=0) return;
        arr[0] = n%10 + arr[0];
        sumOfSSum(n/10, arr);
    }

    private static int fun(String s){
        int c = 0, d=0;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch==' ')
                d++;
            else c++;
        }
        int  n= 500;
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return c;
    }
    
    private static int[] f(int[] arr){
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i] = getSum(arr[i]);
        }
        return ans;
    }

    private static int co(int[] bill){
        int c=0;
        for(int i=0;i<bill.length;i++){
            if(checkPerfectSquare(bill[i])) c++;
        }
        return c;
    }

    static boolean checkPerfectSquare(double number)
    {
        double sqrt=Math.sqrt(number);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }

    private static int getSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    private static ArrayList<Integer> fun(int[] arr, int a, int b){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=a && arr[i]<=b){
                ans.add(arr[i]);
            }
        }
        int[] aa = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            aa[i] = ans.get(i);
        }
        return ans;
    }

//    public static int f(int[] array) {
//        int sum = 0;
//        for (int i = 2; i < array.length; i++) {
//            if (isPrime(i)) {
//                sum += array[i];
//            }
//        }
//        return sum;
//    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

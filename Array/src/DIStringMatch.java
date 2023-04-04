import java.util.Arrays;
import java.util.Scanner;

//Leetcode 942
public class DIStringMatch {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        String s = sc.next();
        System.out.println(Arrays.toString(diStringMatch(s)));
    }

    public static int[] diStringMatch(String s){
        int[] arr = new int[s.length()+1];
        int c=0,d=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='I'){
                arr[i] = c;
                c++;
            }
            else{
                arr[i] = s.length()-d;
                d++;
            }
        }
        arr[s.length()] = c;
        return arr;
    }
}

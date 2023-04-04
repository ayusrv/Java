import java.util.ArrayList;
import java.util.Scanner;

public class Ar2_PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printPascal(n));
    }

    public static ArrayList<ArrayList<Integer>> printPascal(int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        arr.add(ar);
        if(n==1){
            return arr;
        }
        int i=1;
        for (int j = 0; j <= i; j++) {
            if(j==0 || j==i){
                ar.add(1);
            }
            else{
                int k=1;
                while(k<i){
                    ArrayList<Integer> abc = arr.get(i-1);
                    ar.add(abc.get(k) + abc.get(k+1));
                    k++;
                }
            }
            arr.add(ar);
            i++;
        }
        return arr;
    }
}

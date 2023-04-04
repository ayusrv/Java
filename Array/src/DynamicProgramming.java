import java.util.Scanner;

public class DynamicProgramming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(uniquePaths(m,n));
    }

    public static int uniquePaths(int m, int n){
        int[][] arr = new int[m][n];
        return ans(m,n,arr);
    }

    public static int ans(int m, int n, int[][] arr){
        //Base case to check
        return 0;
    }
}

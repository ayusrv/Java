import java.util.Scanner;

public class Ar7_RotateImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        rotate(arr);
    }

    public static void rotate(int[][] arr){
        int[][] ans = new int[arr.length][arr.length];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ans[n-i-1][j];
            }
        }
    }
}

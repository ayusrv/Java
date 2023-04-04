import java.util.HashSet;
import java.util.Scanner;

public class Ar1_SetMatrixZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        setZeros(arr);
    }

    public static void setZeros(int matrix[][]) {
        // Write your code here..\
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if(row.contains(i)){
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(col.contains(i)){
                for (int j = 0; j < m; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}

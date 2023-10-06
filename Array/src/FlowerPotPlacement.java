import java.util.Scanner;

public class FlowerPotPlacement {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int l, w, h;
//        l = scanner.nextInt();
//        w = scanner.nextInt();
//
//        int[][] arr = new int[l][w];
//
//        for (int i = 0; i < l; ++i) {
//            for (int j = 0; j < w; ++j) {
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//
//        h = scanner.nextInt();
//        int[] ans = new int[2];
//        solve(l, w, arr, h, ans);
//        System.out.println(ans[0]+" "+ans[1]);

        int m1 = 7;
        int n1 = 6;
        char[] targets1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};
        int[] columnIndices1 = {5, 1, 6, 3, 3, 4, 5, 0, 5, 3, 5};
        int[] rowPointers1 = {0, 1, 3, 4, 7, 8, 9, 11};

        char[][] matrix1 = constructBattlefieldMatrix(m1, n1, targets1, columnIndices1, rowPointers1);
        printMatrix(matrix1);

        // Example 2
        int m2 = 7;
        int n2 = 6;
        char[] targets2 = {'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'};
        int[] columnIndices2 = {5, 3, 4, 0, 2, 4, 0, 1, 3, 4};
        int[] rowPointers2 = {0, 1, 1, 3, 4, 5, 6, 10};

        char[][] matrix2 = constructBattlefieldMatrix(m2, n2, targets2, columnIndices2, rowPointers2);
        printMatrix(matrix2);

    }

    public static char[][] constructBattlefieldMatrix(int m, int n, char[] targets, int[] columnIndices, int[] rowPointers) {
        // Initialize an empty matrix filled with 'z'
        char[][] battlefield = new char[m][n];
        for (char[] row : battlefield) {
            for (int i = 0; i < n; i++) {
                row[i] = 'z';
            }
        }

        // Iterate through row ranges defined by rowPointers
        for (int i = 0; i < m; i++) {
            int start = rowPointers[i];
            int end = rowPointers[i + 1];

            // Iterate through column indices for the current row
            for (int j = start; j < end; j++) {
                int columnIndex = columnIndices[j];
                char target = targets[j];

                // Place the enemy target in the matrix
                battlefield[i][columnIndex] = target;
            }
        }

        return battlefield;
    }

    public static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private static void solve(int l, int w, int[][] arr, int h, int[] ans){
        int row = l - 1, col = w - 1;
        boolean flag = false;
        for (int i = 0; i < l; ++i) {
            for (int j = 0; j < w; ++j) {
                if (arr[i][j] >= h) {
                    row = i;
                    col = j;
                    flag = true;
                }
                if (flag) break;
            }
            if (flag) break;
        }
        ans[0] = row;
        ans[1] = col;
    }
}
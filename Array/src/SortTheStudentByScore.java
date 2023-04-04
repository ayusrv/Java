import java.util.*;

//Leetcode 2545
public class SortTheStudentByScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] score = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                score[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        System.out.println(Arrays.deepToString(sortTheStudents(score, k)));
    }

    public static int[][] sortTheStudents(int[][] score, int k) {
        int r = score.length;
        int c = score[0].length;
        int[][] ans = new int[r][c];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < r; i++) {
            map.put(score[i][k],i);
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            for (int i = e.getValue(); i <=e.getValue() ; i++) {
                System.arraycopy(score[i], 0, ans[r - 1], 0, c);
                r--;
            }
        }
        r = score.length;
        return ans;
    }
}
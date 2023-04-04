import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ar8_MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                intervals[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(merge(intervals)));
    }

    public static int[][] merge(int[][] intervals)
    {
        if(intervals.length==0)
        {
            return intervals;
        }
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> ans = new ArrayList<>();
        int[] curr_interval = intervals[0];
        ans.add(curr_interval);
        for(int[] interval: intervals){
            int curr_end = curr_interval[1];
            int next_end = interval[1];
            int next_start = interval[0];
            if(curr_end>=next_start){
                curr_interval[1] = Math.max(curr_end,next_end);
            }
            else{
                curr_interval = interval;
                ans.add(curr_interval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}

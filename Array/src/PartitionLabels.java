import java.util.*;

public class PartitionLabels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(partitionLabels(s));
    }

    public static List<Integer> partitionLabels(String s){
        int[][] arr = new int[26][2];
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int[] j = arr[s.charAt(i) - 97];
            if(j[0]!=0){
                j[0] = i+1;
            }
        }
        return l;
    }
}
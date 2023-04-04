import java.util.ArrayList;
import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gas = new int[n];
        for (int i = 0; i < n; i++) {
            gas[i] = sc.nextInt();
        }
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }
        System.out.println(canCompleteCircuit(gas,cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost){
        int i = 0;
        int sum1 = 0;
        int n = gas.length;
        for (int k : gas) {
            sum1 += k;
        }
        int sum2=0;
        for (int j = 0; j < n; j++) {
            sum2+=cost[j];
        }
        if(sum2>sum1){
            return -1;
        }
        int prev=0;
        int next=0;
        for (int j = 0; j < n; j++) {
            prev = prev + (gas[j] - cost[j]);
            if (prev < 0) {
                next = j + 1;
                prev = 0;
            }
        }
        return next;
    }
}

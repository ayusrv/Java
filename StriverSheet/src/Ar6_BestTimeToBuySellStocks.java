//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

import java.util.Scanner;

public class Ar6_BestTimeToBuySellStocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int price : prices) {
            if (min > price) {
                min = price;
            }
            max = Math.max(max, price - min);
        }
        return max;
    }
}

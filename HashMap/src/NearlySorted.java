//https://practice.geeksforgeeks.org/problems/nearly-sorted-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class NearlySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(nearlySorted(arr,n,k));
    }
    private static ArrayList<Integer> nearlySorted(int arr[], int num, int k)
    {
        // your code here
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //Add values to priority queue till k
        for (int i = 0; i <=k; i++) {
            pq.add(arr[i]);
        }

        //Now those values till k are sorted now add them to the arraylist and then remove it from the queue and add the values from k+1 to length
        for (int i = k+1; i < num; i++) {
            ans.add(pq.remove());
            pq.add(arr[i]);
        }

        //now add the remaining values of priorityqueue into the arraylist
        while (pq.size()>0){
            ans.add(pq.remove());
        }
        return ans;
    }
}

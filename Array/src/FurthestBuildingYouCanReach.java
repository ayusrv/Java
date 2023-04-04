import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Leetcode 1642
public class FurthestBuildingYouCanReach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        int brick = sc.nextInt();
        int ladders = sc.nextInt();
        System.out.println(furthestBuilding(height,brick,ladders));
    }

    public static int furthestBuilding(int[] height, int brick, int ladders){
        int c = 0;

        return solution(height,brick,ladders,0,0);
    }
    public static int solution(int[] height, int brick, int ladders,int i, int c){
        if(i==height.length-1){
            return c;
        }
        if(ladders==0){
            return solution(height,brick-(height[i+1]-height[i]),ladders,i+1,c++);
        }
        if(brick==0){
            return solution(height,brick,ladders-1,i+1,c++);
        }
        int b = solution(height,brick-(height[i+1]-height[i]),ladders,i+1,c++);
        int l = solution(height,brick,ladders-1,i+1,c++);
        return Math.max(l,b);
    }
}

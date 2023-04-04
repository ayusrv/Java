//https://www.codingninjas.com/codestudio/problems/981260?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ar7_RotateImageCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> ar = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                ar.add(sc.nextInt());
            }
            mat.add(ar);
        }
        rotateMatrix(mat,n,m);
    }


    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> ar = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                if(i==0 && j<m-1){
                    ar.add(1,mat.get(i).get(j));
                }
            }
        }

    }
}

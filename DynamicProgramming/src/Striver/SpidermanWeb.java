package Striver;

import java.util.Scanner;

public class SpidermanWeb {
        public static int solve(int i, int n, int c1, int c2, int c3) {
            if (i == n) return 0;
            if (i > n) return Integer.MAX_VALUE; // Return a large value if i goes beyond n

            int op1 = c1 + solve(i * 2, n, c1, c2, c3);
            int op2 = c2 + solve(i + 1, n, c1, c2, c3);
            int op3 = Integer.MAX_VALUE;
            if(i>1) {
                op3 = c3 + solve(i - 1, n, c1, c2, c3);
            }

            return Math.min(Math.min(op1, op2), op3);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            int c1 = scanner.nextInt();
            int c2 = scanner.nextInt();
            int c3 = scanner.nextInt();

            int result = solve(1, N, c1, c2, c3);
            System.out.println(result);

            scanner.close();
        }
    }


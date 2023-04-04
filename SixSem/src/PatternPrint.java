import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=i; j--) {
                System.out.print("*");
            }
            if(i==n-1){
                System.out.print(" Ayush  *");
            }
            else {
                for (int k = 0; k < 2 * i; k++) {
                    System.out.print(" ");
                }
                for (int j = n - 1; j >= i; j--) {

                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = (n-2)*2-i*2+1; k >=0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j<=i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Riktum {
    public static int findXIndex(List<Integer> arr) {
        int left = 1;
        int right = arr.size();

        while (left <= right) {
            int x = (left + right) / 2;

            int count_ge_x = 0;
            int count_le_x = 0;

            for (int num : arr) {
                if (num >= x) {
                    count_ge_x++;
                } else {
                    count_le_x++;
                }
            }

            if (count_ge_x >= x && count_le_x <= x) {
                return x;
            } else if (count_ge_x < x) {
                right = x - 1;
            } else {
                left = x + 1;
            }
        }

        return -1;  // If no valid x-index is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int result = findXIndex(arr);
        System.out.println("x-index of the array: " + result);
    }
}

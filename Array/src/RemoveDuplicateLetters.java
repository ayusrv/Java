import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(removeDuplicateLetters(s));
    }

    public static String removeDuplicateLetters(String s) {
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            hs.add(s.charAt(i));
        }
        System.out.println(hs);
        StringBuilder ans = new StringBuilder();
        for (Character ch : hs) {
            ans.append(ch.toString());
        }

        return ans.toString();
    }
}

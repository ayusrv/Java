import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class IsomorphicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashSet<Character> hs1 = new HashSet<>();
        HashSet<Character> hs2 = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            hs1.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            hs2.add(t.charAt(i));
        }
        if(hs1.size()==hs2.size()){
            return true;
        }
        return false;
    }
}

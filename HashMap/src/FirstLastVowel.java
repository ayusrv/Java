import java.util.HashSet;
import java.util.Scanner;

public class FirstLastVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println(findStringVowelFirstAndLast(n, arr));
    }

    private static String findStringVowelFirstAndLast(int n, String[] arr){
        StringBuilder ans = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        for (int i = 0; i < n; i++) {
            if(hs.contains(arr[i].charAt(0)) && hs.contains(arr[i].charAt(arr[i].length()-1))){
                ans.append(arr[i]);
            }
        }
        for (int i = 0; i < ans.length(); i++) {
            if (Character.isUpperCase(ans.charAt(i))) {
                ans.setCharAt(i,
                        Character.toLowerCase(ans.charAt(i)));
            }
        }
        if(ans.length()==0) return "no matches found";
        return ans.toString();
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = new char[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().charAt(0);
        }
        System.out.println(compress(s));
    }

    public static int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        ArrayList<Character> ar = new ArrayList<Character>();
        int c=1;
        char ch;
        for (int i = 0; i < chars.length-2; i++) {
            if(chars[i]==chars[i+1]){
                c++;
            }
            else{
                ar.add(chars[i]);
                if(c!=1){
                    char cc = (char)c;
                    ar.add(cc);
                    c=1;
                }
            }
        }
        if(chars[chars.length-2]==chars[chars.length-1]){
            ar.add(chars[chars.length-1]);
            c+=1;
            char cc = (char)c;
            ar.add(cc);
        }
        else{
            ar.add(chars[chars.length-1]);
        }
        return ar.size();
    }
}

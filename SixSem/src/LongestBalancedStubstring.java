import java.util.Scanner;
import java.util.Stack;

public class LongestBalancedStubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(findTheLongestBalancedSubstring(s));
    }

    public static int findTheLongestBalancedSubstring(String str) {
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        int n = str.length();
        int result = 0;
        for (int i = 0; i < n; i++)
        {
            if (str.charAt(i) == '0')
                stk.push(i);
            else
            {
                if(!stk.empty())
                    stk.pop();
                if (!stk.empty())
                    result
                            = Math.max(result,
                            i - stk.peek());
                else
                    stk.push(i);
            }
        }



        return result;
    }
}

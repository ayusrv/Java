import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(ngl(arr)));
    }

    private static int[] ngl(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        ans[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            while (st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
}

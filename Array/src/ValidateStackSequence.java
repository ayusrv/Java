import java.util.Stack;

public class ValidateStackSequence {
    public static void main(String[] args) {

    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0,j=0; i < pushed.length; i++) {
            st.push(pushed[i]);
            while(!st.isEmpty() && popped[j]==st.peek() ){
                st.pop();
                j++;
            }
        }
        return st.size() == 0;
    }
}
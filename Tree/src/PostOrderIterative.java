import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderIterative {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right.left = new Node(7);
        root.right.left.right = new Node(8);
        root.right.left.right.right = new Node(10);
        root.right.left.right.left = new Node(9);
        System.out.println(postOrder1(root));
        System.out.println(postOrder2(root));
    }

    //Using 2 stack
    public static List<Integer> postOrder1(Node root){
        List<Integer> postorder = new ArrayList<>();
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        if(root==null){
            return postorder;
        }
        st1.push(root);
        while (!st1.isEmpty()){
            root = st1.pop();
            st2.push(root);
            if(root.left!=null){
                st1.push(root.left);
            }
            if(root.right!=null) {
                st1.push(root.right);
            }
        }
        while (!st2.isEmpty()){
            postorder.add(st2.pop().data);
        }
        return postorder;
    }

    //Using 1 stack
    public static List<Integer> postOrder2(Node root) {
        List<Integer> postO = new ArrayList<Integer>();
        Stack<Node> st = new Stack<Node>();
        Node cur = root, temp;
        while(cur != null || !st.isEmpty()) {
            if(cur != null) {
                st.push(cur);
                cur = cur.left;
            }
            else {
                temp = st.peek().right;
                if(temp == null) {
                    temp = st.pop();
                    postO.add(temp.data);
                    while(!st.isEmpty() && temp == st.peek().right) {
                        temp = st.pop();
                        postO.add(temp.data);
                    }
                }
                else cur = temp;
            }
        }
        return postO;
    }
}

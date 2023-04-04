import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderIterative {
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
        System.out.println(preorder(root));
    }

    private static List<Integer> preorder(Node root){
        List<Integer> preorder = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if(root==null){
            return preorder;
        }
        st.push(root);
        while (!st.isEmpty()){
            root = st.pop();
            preorder.add(root.data);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
        }
        return preorder;
    }
}

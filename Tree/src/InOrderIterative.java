import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderIterative {
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
        System.out.println(inOrder(root));
    }

    private static List<Integer> inOrder(Node root){
        List<Integer> inorder = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node node = root;
        while (true){
            if(node!=null){
                st.push(node);
                node = node.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                inorder.add(node.data);
                node = node.right;
            }
        }

        return inorder;
    }
}

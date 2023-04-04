import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
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
        System.out.println(levelOrder(root));
    }

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ll = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root==null){
            return ll;
        }
        q.add(root);
        while (!q.isEmpty()){
            int s = q.size();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < s; i++) {
                Node top = q.peek();
                l.add(top.data);
                q.poll();
                if(top.left!=null){
                    q.add(top.left);
                }
                if(top.right!=null){
                    q.add(top.right);
                }
            }
            ll.add(l);
        }
        return ll;
    }
}

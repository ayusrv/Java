import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZag {
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
        System.out.println(zigzagLevelOrder(root));

    }

    public static List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Node> q = new LinkedList<>();
        boolean flag = true;
        q.add(root);
        while (!q.isEmpty()){
            LinkedList<Integer> l = new LinkedList<>();
            int s = q.size();
            for (int i=0;i<s;i++){
                Node n = q.poll();
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);

                if(flag){
                    l.addFirst(n.data);
                }
                else{
                    l.addLast(n.data);
                }
            }
            flag=!flag;
            ans.add(l);
        }
        return ans;
    }
}

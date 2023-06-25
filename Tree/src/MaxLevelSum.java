import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxLevelSum {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(7);
        root.right = new Node(0);
        root.left.left = new Node(7);
        root.left.right = new Node(-8);
//        root.left.right.left = new Node(6);
//        root.right.left = new Node(7);
//        root.right.left.right = new Node(8);
//        root.right.left.right.right = new Node(10);
//        root.right.left.right.left = new Node(9);

        System.out.println(maxLevelSum(root));
    }

    public static int maxLevelSum(Node root) {
        List<List<Integer>> ll = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root==null) return 0;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int s = q.size();
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
        System.out.println(ll);
        int max = Integer.MIN_VALUE;
        int lev = 1;
        for (int i = 0; i < ll.size(); i++) {
            int sum=0;
            for (int j = 0; j < ll.get(i).size(); j++) {
                sum+=ll.get(i).get(j);
            }
            if(max<sum){
                max = sum;
                lev=i+1;
            }
        }
        return lev;
    }
}


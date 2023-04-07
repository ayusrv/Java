import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevel {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        System.out.println(averageOfLevels(root));
    }

    public static List<Double> averageOfLevels(Node root) {
        List<List<Integer>> arr = levelOrder(root);
        List<Double> ans = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            double sum=0;
            for (int j = 0; j < arr.get(i).size(); j++) {
                sum+=arr.get(i).get(i);
            }
            ans.add(sum);
        }
        return ans;
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

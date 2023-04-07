//import java.util.*;
//
//public class VerticalOrder {
//    public static void main(String[] args) {
//        Node root = new Node(3);
//        root.left = new Node(9);
//        root.left.left = new Node(9);
//        root.left.right = new Node(9);
//        root.right = new Node(20);
//        root.right.left = new Node(15);
//        root.right.right = new Node(7);
//    }
//
//    public List<List<Integer>> verticalTraversal(Node root) {
//        List<List<Integer>> ans = new ArrayList<>();
//        if(root==null){
//            return ans;
//        }
//        Queue<Pair> q = new LinkedList<Pair>();
//        q.offer(new Pair(root,0));
//        HashMap<Integer, HashMap<Integer, Node>> hm= new HashMap<>();
//        while (!q.isEmpty()){
//            Pair top = q.poll();
//
//        }
//
//    }
//}
//class Pair{
//    Node node;
//    int num;
//    Pair(Node node, int num){
//        this.node = node;
//        this.num = num;
//    }
//}
//
//

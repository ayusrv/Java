import java.util.ArrayList;

public class DiagonalSum {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(9);
        root.left.left.right = new Node(10);
        root.left.right = new Node(6);
        root.left.right.left = new Node(11);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(7);
        root.right.right = new Node(5);
        System.out.println(diagonalSum(root));
    }

    public static ArrayList<Integer> diagonalSum(Node root)
    {
        // code here.
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        while (root.right!=null){
            int sum=0;

        }
        return ans;
    }
}

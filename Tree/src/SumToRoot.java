import java.util.ArrayList;

//https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
public class SumToRoot {
    static int[] ans = new int[1];
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(0);
        root.left.left = new Node(0);
        root.left.right = new Node(1);
        root.right = new Node(1);
        root.right.left = new Node(0);
        root.right.right = new Node(1);

        System.out.println(sumRootToLeaf(root));
    }

    public static int sumRootToLeaf(Node root) {
        if(root==null){
            return 0;
        }
        int[] arr = new int[1];
        solve(root, arr);
        return ans[0];
    }

    public static void solve(Node root, int[] arr){
        if(root==null){
            return;
        }
        arr[0] = arr[0]*10;
        arr[0] +=root.data;
        if(root.left!=null && root.right!=null){
            ans[0] +=arr[0];
            System.out.println(ans[0]);
        }
        solve(root.left,arr);
        solve(root.right,arr);
    }
}

public class RootEqualSumChild {
    public static void main(String[] args) {
        Node root = new Node(30);
        root.left = new Node(15);
        root.left.left = new Node(8);
        root.left.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(3);
        root.right = new Node(15);
        root.right.left = new Node(6);
        root.right.right = new Node(9);
        System.out.println(checkTree(root));
    }

    public static boolean checkTree(Node root) {
        if(root==null || (root.left==null&&root.right==null)){
            return true;
        }
        if(root.left==null){
            return root.data==root.right.data;
        }
        if(root.right==null){
            return root.data==root.left.data;
        }
        boolean lh = checkTree(root.left);
        boolean rh = checkTree(root.right);
        return lh&&rh;
    }
}

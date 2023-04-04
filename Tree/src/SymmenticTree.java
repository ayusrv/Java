public class SymmenticTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.right.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(Node root){
        if(root==null){
            return true;
        }
        else{
            return isSame(root.left, root.right);
        }
    }

    public static boolean isSame(Node p, Node q){
        if(p==null || q==null){
            return p==q;
        }
        return isSame(p.left,q.right) && isSame(p.right,q.left) && p.data==q.data;
    }
}

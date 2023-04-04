public class SameTree {
    public static void main(String[] args) {
        Node root1 = new Node(1);
        Node root2 = new Node(1);
        root1.left = new Node(2);
        root2.left = new Node(2);
        root1.right = new Node(3);
        root2.right = new Node(3);

        System.out.println(isSameTree(root1,root2));
    }

    public static boolean isSameTree(Node p, Node q){
        if(p==null || q==null){
            return p==q;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right)&& p.data==q.data;
    }
}

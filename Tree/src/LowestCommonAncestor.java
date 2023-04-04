public class LowestCommonAncestor {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);
        root.right = new Node(1);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        int n1=5;
        int n2=4;
        System.out.println(lca(root,n1,n2));
    }

    public static Node lca(Node root, int n1, int n2){
        if(root==null){
            return null;
        }
        if(root.data==n1 || root.data==n2){
            return root;
        }
        Node lh = lca(root.left,n1,n2);
        Node rh = lca(root.right,n1,n2);
        if(lh!=null && rh!=null){
            return root;
        }
        else if(lh==null && rh!=null){
            return rh;
        }
        else if(lh!=null && rh==null){
            return lh;
        }
        else {
            return null;
        }
    }
}


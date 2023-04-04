public class SumTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(10);
        root.left.right = new Node(10);

        System.out.println(isSumTree(root));
    }

    public static boolean isSumTree(Node root){
        if(root.left!=null && root.right!=null){
            if(!(root.data==root.left.data+root.right.data)){
                return false;
            }
            if(!isSumTree(root.left)){
                return false;
            }
            if(!isSumTree(root.right)){
                return false;
            }
        }
        else if((root.left==null && root.right!=null) || (root.left!=null && root.right==null)){
            return false;
        }
        return true;
    }
}

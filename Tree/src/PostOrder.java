public class PostOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right.left = new Node(7);
        root.right.left.right = new Node(8);
        root.right.left.right.right = new Node(10);
        root.right.left.right.left = new Node(9);
        postOrder(root);
    }
    public static void postOrder(Node root){
        if(root==null)  return;

        postOrder(root.left);
        System.out.print(root.data+" ");
        postOrder(root.right);
    }
}

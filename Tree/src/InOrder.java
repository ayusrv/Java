public class InOrder {
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
        inOrder(root);
    }

    public static void inOrder(Node root){
        if(root==null)  return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
}

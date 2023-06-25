public class FlatterBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(5);
        root.right.right = new Node(6);
        root.left = new Node(2);
        root.left.right = new Node(4);
        root.left.left = new Node(3);
        flatten(root);

    }

    public static void flatten(Node root) {
        Node ans = new Node(root.data);


    }
}

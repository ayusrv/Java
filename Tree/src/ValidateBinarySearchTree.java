public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(6);
        root.right.left = new Node(3);
        root.right.right = new Node(7);

        System.out.println(isValidBST(root));
    }

    public static boolean isValidBST(Node root) {
        return true;
    }
}

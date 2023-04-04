public class ImplementBST {
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);
        System.out.println(search(root,6));
    }

    public static Node search(Node root, int key){
        if(root==null || root.data==key){
            return root;
        }
        if(root.data<key){
            return search(root.right,key);
        }
        return search(root.left,key);
    }
}

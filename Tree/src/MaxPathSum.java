public class MaxPathSum {
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
        System.out.println(maxPathSum(root));
    }

    public static int maxPathSum(Node root) {
        int[] maxV = new int[1];
        maxV[0] = Integer.MIN_VALUE;
        maxSum(root,maxV);
        return maxV[0];
    }

    public static int maxSum(Node root, int[] i){
        if(root==null) return 0;
        int lh = Math.max(0,maxSum(root.left,i));
        int rh = Math.max(0,maxSum(root.right,i));
        i[0] = Math.max(i[0],lh+rh+root.data);
        return Math.max(lh,rh)+ root.data;
    }
}

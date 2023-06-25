public class Diameter {
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
        System.out.println(diameterOfBinaryTree(root));
    }

    public static int diameterOfBinaryTree(Node root) {
        int[] dia = new int[1];
        height(root,dia);
        return dia[0];
    }

    private static int height(Node root, int[] dia){
        if(root==null){
            return 0;
        }
        int lh=height(root.left,dia);
        int rh=height(root.right,dia);
        dia[0] = Math.max(dia[0],lh+rh);
        return 1+Math.max(lh,rh);
    }

    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int dia = Math.max(Math.max(leftInfo.diam, rightInfo.diam), rightInfo.ht+ leftInfo.ht+1);
        int ht = Math.max(rightInfo.ht, rightInfo.ht)+1;
        return new Info(dia, ht);
    }
}



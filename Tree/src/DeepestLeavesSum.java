import javax.management.Query;
import java.util.ArrayList;
import java.util.LinkedList;

public class DeepestLeavesSum {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.left.left.left = new Node(7);
        root.right.right.right = new Node(8);

        try{
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x+b+d);
        }
        catch (NumberFormatException e){
            System.out.println("bad num");
        }

    }

    public static int deepestSum(Node root){
        int res = 0,i;
        LinkedList<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            for (i = q.size()-1,res=0; i >=0 ; i--) {
                Node val = q.poll();
                res+=val.data;
                if(val.left!=null) q.add(val.left);
                if(val.right!=null) q.add(val.right);
            }
        }
        return res;
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }

    public static void putVal(Node root, ArrayList<Integer> arr, int h){
        if(root==null){
            return;
        }
        int i=1;
        while (root.left!=null){
            if(i==h){
                System.out.println(root.data);
            }
            else{
                root = root.left;
            }
            i++;
        }
    }
}

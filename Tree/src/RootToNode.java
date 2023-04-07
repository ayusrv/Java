import java.util.ArrayList;
import java.util.Scanner;

public class RootToNode {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(7);
        root.left.right.left = new Node(6);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(solve(root, a));
    }

    public static ArrayList<Integer> solve(Node root, int a){
        ArrayList<Integer> arr = new ArrayList<>();
        if(root==null){
            return arr;
        }
        boolean b = getPath(arr,root,a);
        return arr;
    }
    public static boolean getPath(ArrayList<Integer> arr, Node root, int a){
        if(root==null){
            return false;
        }
        arr.add(root.data);
        if(root.data==a){
            return true;
        }
        if(getPath(arr,root.left,a) || getPath(arr,root.right,a)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }
}

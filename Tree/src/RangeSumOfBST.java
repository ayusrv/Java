import java.util.Scanner;

public class RangeSumOfBST {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right = new Node(15);
        root.right.right = new Node(18);
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        System.out.println(rangeSumBST(root,low,high));
    }

    public static  int rangeSumBST(Node root, int low, int high) {
        int[] arr = new int[1];
        answer(root,low,high,arr);
        return arr[0];
    }

    private static void answer(Node root, int low, int high, int[] arr){
        if(root==null){
            return;
        }
        if(root.data>=low && root.data<=high){
            arr[0] += root.data;
        }
        if(root.data<high){
            answer(root.right,low,high,arr);
        }
        if(root.data>low){
            answer(root.left,low,high,arr);
        }
    }
}

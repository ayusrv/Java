import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


class medianFinder{

    //Making two priorityqueue left for storing half values in descending order and right for ascending order
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    void medianFinder(){
        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
    }

    public void add(int num){

        //always first add the value to the left then after check for the right one
        if(right.size()>0 && right.peek()<num){
            right.add(num);
        }

        //simply add values to the left
        else {
            left.add(num);
        }

        //here the second value automatically go to the left but we put it into the right and checking if the value is lesser then the left one we add to the left and push left value to the right
        if(left.size()-right.size()>1){
            right.add(left.remove());
        }

        //same with the left one
        else if(right.size()-left.size()==2){
            left.add(right.remove());
        }
    }

    public double findMedian(){
        if(left.size()==0) return -1;

        //if left has more value the peek will be the answer
        if(left.size()>right.size()) return left.peek();

        //if both having same size then the average is the answer
        else if(left.size()==right.size()) return (double) (left.peek()+right.peek())/2;

        //if right has more values the right is the answer
        else return right.peek();

    }

}

public class FindMedian extends medianFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        medianFinder mf = new medianFinder();
        mf.medianFinder();
        for(int val:arr){
            mf.add(val);
        }

        System.out.print(mf.findMedian());
    }
}

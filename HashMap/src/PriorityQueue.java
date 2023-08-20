import java.util.ArrayList;

class PriorityQueue {

    public static void main(String[] args) {
        prioritQueue pq = new prioritQueue();
        pq.add(45);
        pq.add(20);
        pq.add(14);
        pq.add(121);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        pq.remove();
        pq.add(11);
        pq.add(13);
        pq.add(2);
        System.out.println(pq.peek());
    }
}

class prioritQueue{
    ArrayList<Integer> data;
    public prioritQueue(){
        data = new ArrayList<>();
    }

    public void add(int a){
        data.add(a);
        upheapify(data.size()-1);
    }

    public void upheapify(int i){
        if(i==0) return;
        int pi = (i-1)/2;
        if(data.get(pi)> data.get(i)){
            swap(pi, i);
            upheapify(pi);
        }
    }

    public void swap(int a, int b){
        int i = data.get(a);
        int j = data.get(b);
        data.set(a, j);
        data.set(b, i);
    }

    public int remove(){
        swap(data.size()-1, 0);
        downheapify(0);
        return data.remove(data.size()-1);
    }

    public void downheapify(int i){
//        if(i==data.size()-1) return;
//        int ind = data.get(2*i+1) > data.get(2*i + 2)? 2*i+2 : 2*i+1;
//        if(data.get(i)> data.get(ind)){
//            swap(i, ind);
//            downheapify(ind);
//        }

        int min = i;
        int li = 2*i+1;
        if(li < data.size() && data.get(min)> data.get(li)){
            min = li;
        }

        int ri = 2*i+2;
        if(ri< data.size() && data.get(min)> data.get(ri)){
            min = ri;
        }
        if(min!=i){
            swap(min, i);
            downheapify(min);
        }
    }

    public int peek(){
        if(data.size()==0) return -1;
        return data.get(0);
    }

    public int size(){
        return data.size();
    }
}

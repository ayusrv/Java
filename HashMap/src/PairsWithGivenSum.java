import java.util.*;

public class PairsWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long x = sc.nextLong();
        long[] A = new long[(int) n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextLong();
        }
        long[] B = new long[(int) m];
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextLong();
        }
        System.out.println(Arrays.toString(allPairs(A, B, n, m, x)));
    }

    public static pair[] allPairs( long a[], long b[], long n, long m, long x) {
        // Your code goes here
        HashMap<Long, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(a[i],0);
        }
        ArrayList<pair> arr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if(hm.containsKey(x-b[i])){
                pair p = new pair(x-b[i], b[i]);
                arr.add(p);
            }
        }
        pair[] pair = new pair[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            pair[i] = arr.get(i);
        }
        ArrayOfPairsSorter.sort(pair);
        return pair;
    }
}

class ArrayOfPairsSorter {

    static void sort(pair[] arr) {
        Comparator<pair> comparator = new Comparator<>() {
            @Override
            public int compare(pair p1, pair p2) {
                return (int) (p1.first
                                        - p2.second); // To compare the first element
                // just
                // change the variable from p1.y
                // - p2.y to p1.x-p2.x.
            }
        };
        Arrays.sort(arr, comparator);
    }
}

class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}

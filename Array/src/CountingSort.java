import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {4,2,1,1,5};
        sort(arr,arr.length);
    }
    public static void sort(int[] a, int n)
    {
        int[] b = new int[1000];
        for(int i=1;i<=n;i++)
            b[i]=0;
        for(int i=1;i<=n;i++)
        {
            b[a[i-1]]++;
        }
        for(int i=1;i<=n;i++)
        {
            while(b[i]>0)
            {
                System.out.print(i+" ");
                b[i]--;
            }
        }
    }
}
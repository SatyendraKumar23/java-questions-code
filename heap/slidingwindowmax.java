import java.util.*;
public class slidingwindowmax {
    static class pair implements Comparable<pair>
    {
        int val;
        int idx;

        pair(int val,int idx)
        {
            this.val=val;
            this.idx=idx;
        }
         @Override
    public int compareTo(pair p2)
    {
        return p2.val-this.val;
    }
    }
   
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;

        PriorityQueue<pair>pq=new PriorityQueue<>();
        int result[]=new int[arr.length-k+1];

        for(int i=0;i<k;i++)
        {
            pq.add(new pair(arr[i], i));
        }
        result[0]=pq.peek().val;

        for(int i=k;i<arr.length;i++)
        {
            while(pq.size()>0&&pq.peek().val<=(i-k))
            {
                pq.remove();
            }
            pq.add(new pair(arr[i], i));
            result[i-k+1]=pq.peek().val;
        }

        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }


    }
    
}

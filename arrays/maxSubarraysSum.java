package arrays;

public class maxSubarraysSum {
    public static void maxsum(int arr[])
    {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++)
                {
                    currsum=currsum+arr[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum)
                {
                    maxsum=currsum;
                }
            }
        }
        System.out.println("maxsum is:"+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};

        maxsum(arr);
    }
    
}

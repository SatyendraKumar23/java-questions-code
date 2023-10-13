package arrays;

public class kadanes {
    public static void kadaness(int arr[])
    {
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;

        for(int i=0;i<arr.length;i++)
        {
            currsum=currsum+arr[i];
            if(currsum<0)
            {
                currsum=0;
            }

            maxsum=Math.max(currsum,maxsum);

        }
        System.out.println(maxsum);

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};

        kadaness(arr);
    }
    
}

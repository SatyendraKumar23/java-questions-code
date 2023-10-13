public class quicksort {
    public static void quicksorting(int arr[],int si,int ei)
    {
        //base
        if(si>=ei)
        {
            return;
        }
        int pidx=partition(arr,si,ei);
        quicksorting(arr, si, pidx-1);
        quicksorting(arr, pidx+1, ei);
    }
    public static int partition(int arr[],int si,int ei)
    {
        int pivot=arr[ei];
        int i=si-1;

        for(int j=si;j<ei;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        //pivot original place
        i++;
        //swap
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        int si=0;
        int ei=arr.length-1;
        quicksorting(arr,si,ei);
        printarr(arr);
    }
    
}

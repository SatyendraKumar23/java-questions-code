public class mergesort {
    public static void mergesortt(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=(si+ei)/2;

        mergesortt(arr, si, mid);
        mergesortt(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei)
    {
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=ei)
        {
            if(arr[i]>arr[j])
            {
                temp[k]=arr[j];
                j++;
                k++;

            }
            else{
                temp[k]=arr[i];
                i++;
                k++;
            }
        }
        //left remaining sorted part
        while(i<=mid)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=ei)
        {
            temp[k]=arr[j];
            j++;
            k++;
        }

        for(k=0,i=si;k<temp.length;i++,k++)
        {
            arr[i]=temp[k];
        }
    }
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int si=0;
        int ei=arr.length-1;
        mergesortt(arr,si,ei);
        printarr(arr);
    }
    
}

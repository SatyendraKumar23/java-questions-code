public class searchinsortedrotatematrix {
    public static int search(int arr[],int si,int ei,int target)
    {
        //base
        if(si>ei)
        {
            return -1;
        }
        int mid=(si+ei)/2;
        if(arr[mid]==target)
        {
            return mid;
        }

        if(arr[si]<=arr[mid])//line 1
        {
            if(arr[si]<=target&&target<=arr[mid])
            {
                //left
               return search(arr, si, mid-1, target);
            }
            else{
                //right
                return search(arr, mid+1, ei, target);
            }
        }
        else{
            if(arr[mid]<=target&&target<=arr[ei])
            {
                return search(arr, mid+1, ei, target);//right
            }
            else{
                //left
                return search(arr, si, mid-1, target);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr,0,arr.length-1,2));
    }
    
}

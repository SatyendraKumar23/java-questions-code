package arrays;

public class binarysearch {
    public static int binarysearching(int arr[],int key){
    int si=0;
    int ei=arr.length-1;

    for(int i=si;i<=ei;i++)
    {
        int mid=(si+ei)/2;

        if(arr[mid]==key)
        {
            return mid;
        }
        if(arr[mid]<key)
        {
            si=mid+1;
        }
        else{
            ei=mid-1;
        }
    }
    return -1;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,56};
        int key=56;

        int idx=binarysearching(arr,key);
        if(idx==-1)
        {
            System.out.println("not found ");
        }
        else{
            System.out.println(idx);
        }
    }
    
}

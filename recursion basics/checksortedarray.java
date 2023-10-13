public class checksortedarray {
    public static boolean sorted(int arr[],int i)
    {
        //base
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return sorted(arr,i+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,8 ,4,5};
        int si=0;
        System.out.print(sorted(arr,si));
        }
    }
    


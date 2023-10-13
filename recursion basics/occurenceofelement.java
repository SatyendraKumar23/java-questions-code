public class occurenceofelement {
    public static int firstoccurence(int arr[],int key,int i)
    {
        //base
        if(i==arr.length)
        {
            return -1;
        }
        //kaam\
        if(arr[i]==key)
        {
            return i;
        }
        return firstoccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int key=5;
        System.out.println(firstoccurence(arr,key,0));
    }
    
}

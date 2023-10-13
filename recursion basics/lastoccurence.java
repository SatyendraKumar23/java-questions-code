public class lastoccurence {
    public static int occrence(int arr[],int key,int i)
    {
        //base
        if(i==arr.length)
        {
            return -1;
        }
        int isfound=occrence(arr, key, i+1);

        if(isfound==-1&&arr[i]==key)
        {
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,4};

        int key=4;
        int i=0;

        System.out.print(occrence(arr,key,i));
    }
    
}

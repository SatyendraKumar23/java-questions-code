package arrays;

public class linearsrch {
    public static int linear(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
            
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,4,8};
        int key=8;

        int index=linear(arr,key);
        if(index==-1)
        {
            System.out.println("not found");
        }
        else{
            System.out.println(index);
        }
    }
}
    

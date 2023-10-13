package arrays;

public class largest {
    public static void findlargest(int arr[])
    {
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int arr[]={10,32,21,46,81,67};

        findlargest(arr);
    }
    
}

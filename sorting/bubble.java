import java.util.*;

public class bubble {
    public static void bubblesort(int arr[])
    {
        int n=arr.length;

        for(int turn =0;turn<n-1;turn++)
        {
            for(int j=0;j<n-1-turn;j++)
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubblesort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}

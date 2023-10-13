import java.util.*;
public class unionAndIntersection {
    public static void unionandintersection(int arr[],int arr2[])
    {
        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            set.add(arr2[i]);
        }
        System.out.println(set);

       System.out.println("union : " + set.size()+" ");


       //itersection
       set.clear();

       for(int i=0;i<arr.length;i++)
       {
        set.add(arr[i]);
        
       }
       int count=0;
       for(int i=0;i<arr2.length;i++)
       {
        int curr=arr2[i];
        if(set.contains(curr))
        {
            count++;
            System.out.print(curr+" ");
            set.remove(curr);
            
        }
       }
       
       System.out.println("intersection: "+ count);
    }
    public static void main(String[] args) {
        int arr[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};

        unionandintersection(arr,arr2);
    }
    
}

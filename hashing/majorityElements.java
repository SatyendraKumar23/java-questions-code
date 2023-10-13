import java.util.*;
public class majorityElements {

    public static void majority(int arr[])
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            int nums=arr[i];

            if(map.containsKey(nums))
            {
                map.put(nums,map.get(nums)+1);
            }
            else{
                map.put(nums,1);
            }

            
        }
        Set<Integer>keySet=map.keySet();
        for(Integer key: keySet)
        {
            if(map.get(key)>n/3)
            {
                System.out.println(key);
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        majority(arr);
    }
    
}

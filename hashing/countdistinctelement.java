import java.util.*;
public class countdistinctelement {
    public static void distinct(int nums[])
    {
        HashSet<Integer>set=new HashSet<>();
      
       for(int i=0;i<nums.length;i++)
       {
        set.add(nums[i]);
       }
       int count=0;
       for(int i=0;i<set.size();i++)
       {
        count++;
       }
       System.out.println(count);

    
    }
    public static void main(String[] args) {
        int nums[]={4,3,2,5,6,7,3,4,2,1};

        distinct(nums);
    }

    
}

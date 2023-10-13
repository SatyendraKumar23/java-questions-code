//asked in many comapny 
//logic is very importatnt  also used in many question like disjoint sets ,maxm meeting
import java.util.*;
public class activityselection {
    public static void main(String[] args) {
        int start[]={10,12,20};
        int end[]={20,25,30};
        int maxact=0;

        ArrayList<Integer>ans=new ArrayList<>();

        ans.add(0);
        maxact=1;

        int lastend=end[0];

        for(int i=1;i<start.length;i++)
        {
            if(start[i]>=lastend)
            {
                ans.add(i);
                maxact++;
                lastend=end[i];
            }
            


        }
        System.out.println(maxact);

        for(int i=0;i<ans.size();i++)
        {
            System.out.println("A"+ans.get(i));

        }

         
    }
    
}

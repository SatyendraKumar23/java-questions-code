import java.util.*;
public class activityselectionnotsorted {
    public static void main(String[] args) {
         int start[]={10,12,20};
        int end[]={20,25,30};

        int activities[][]=new int[start.length][3];

        for(int i=0;i<start.length;i++)
        {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

        int maxact=0;
        ArrayList<Integer>ans=new ArrayList<>();

        ans.add(activities[0][0]);
        maxact=1;

        int lastend=activities[0][2];

        for(int i=1;i<start.length;i++)
        {
            if(activities[i][1]>=lastend)
            {
                ans.add(activities[i][0]);
                maxact++;
                lastend=activities[i][2];
            }
            


        }
        System.out.println(maxact);

        for(int i=0;i<ans.size();i++)
        {
            System.out.println("A"+ans.get(i));

        }


    }
    
}

import java.util.*;
public class chocoproblem {
    public static void main(String[] args) {
        Integer costhorz[]={4,1,2};
        Integer costver[]={2,1,3,1,4};

        Arrays.sort(costhorz,Collections.reverseOrder());
        Arrays.sort(costver,Collections.reverseOrder());

        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;

        while(h<costhorz.length&&v<costver.length)
        {
            if(costhorz[h]<=costver[v])
            {
                cost=cost+(costver[v]*hp);
                v++;
                vp++;

            }
            else{
                cost=cost+(costhorz[h]*vp);
                h++;
                hp++;
            }

        }
        while(h<costhorz.length)
        {
            cost=cost+(costhorz[h]*vp);
                h++;
                hp++;
        }
        while(v<costver.length)
        {
            cost=cost+(costver[v]*hp);
                v++;
                vp++;
        }
        System.out.println(cost);
    }
    
}

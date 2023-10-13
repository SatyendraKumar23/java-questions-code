import java.util.*;
public class jobsequencingproblem {
    static class job{
        int deadline;
        int profit;
        int id;

        job(int i,int d,int p)
        {
            this.id=i;
            this.deadline=d;
            this.profit=p;
        }
    }
    public static void main(String[] args) {
        int jobinfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<job>jobs=new ArrayList<>();

        for(int i=0;i<jobinfo.length;i++)
        {
            jobs.add(new job(i,jobinfo[i][0],jobinfo[i][1]));
        }
        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);//descending order

        ArrayList<Integer>seq=new ArrayList<>();


        int time=0;
        for(int i=0;i<jobs.size();i++)
        {
            job curr=jobs.get(i);

            if(curr.deadline>time)
            {
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("max jobs"+seq.size());
        for(int i=0;i<seq.size();i++)
        {
            System.out.print("job"+ seq.get(i)+" ");
        } 
        System.out.println();
    }

}

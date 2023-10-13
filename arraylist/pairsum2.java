import java.util.*;
public class pairsum2 {
    public static boolean pair(ArrayList<Integer>list,int target)
    {
        int bp=-1;//breaking point 
        int n=list.size();
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>list.get(i+1))
            {
                bp=i;
                break;
            }
        }

        int lp=bp+1;
        int rp=bp;
        while(lp!=rp)
        {
            if(list.get(lp)+list.get(rp)==target)
            {
                return true;
            }
            if(list.get(lp)+list.get(rp)<target)
            {
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
         ArrayList<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(pair(list,4));
    }
    
}

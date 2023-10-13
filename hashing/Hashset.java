import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        set.add("delhi");
        set.add("mumbai");
        set.add("calcultata");

        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println();

        for(String city:set)
        {
            System.out.println(city);
        }
    }
    
}

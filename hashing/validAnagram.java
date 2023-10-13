import java.util.*;
public class validAnagram {
    public static boolean angram(String s,String t)
    {
        HashMap<Character,Integer>map=new HashMap<>( );
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }

        }
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(map.get(ch)!=null)
            {
                if(map.get(ch)==1)
                {
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }
            else{
                return false;
            }
        }
        if(map.isEmpty())
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="knee";
        String t="knee";
        System.out.println(angram(s,t));
    }
    
}

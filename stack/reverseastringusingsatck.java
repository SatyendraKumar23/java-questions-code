import java.util.*;
public class reverseastringusingsatck {
    public static String reverse(String str)
    {
        Stack<Character>s=new Stack<>();
        int idx=0;
        while(idx<str.length())
        {
            char ch=str.charAt(idx);
            s.push(ch);
            idx++;
        }
        StringBuilder sb=new StringBuilder(" ");
        while(!s.isEmpty())
        {
            char chh=s.pop();
            sb.append(chh);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="satyendra";
        System.out.println(reverse(str));
    }
    
}

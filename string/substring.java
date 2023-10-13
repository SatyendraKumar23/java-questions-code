package string;

public class substring {
    public static String substring1(String str,int si,int ei)
    {
        String str1=" ";

        for(int i= si;i<ei;i++)
        {
            str1+=str.charAt(i);
        }
        return str1;
    }
    public static void main(String[] args) {
        String str="hello world";

        System.out.print(substring1(str,0,5));
    }
    
}

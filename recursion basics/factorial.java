
public class factorial {
    public static int fact(int n)
    {
        //base
        if(n==0)
        {
            return 1;
        }
        //kaam
        int fn=fact(n-1);
        int fm=n*fn;
        return fm;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(fact(n));
    }
    
}

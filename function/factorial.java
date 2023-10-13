public class factorial {
    public static int fact(int n)
    {
        int factoriall=1;
        if(n==0 ||n==1)
        {
            return n;
        }
        while(n!=1)
        {
            factoriall=factoriall*n;
            n=n-1;
            
        }
        return factoriall;
    }
    public static void main(String[] args) {
        int n=5;
        fact(n);

        System.out.println(fact(n));
    }
    
}

public class optimisesquareroot {
    public static int square(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
       int halfsq=square(x,n/2)*square(x,n/2);

       //od case
       if(n%2!=0)
       {
        halfsq=x*halfsq;
       }
       return halfsq;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;

        System.out.println(square(x,n));
    }
    
}

public class squareroot {
    public static int square(int x,int n)
    {
        //base
        if(n==0)
        {
            return 1;
        }

        int sqn=square(x,n-1);
        int sqm=x*sqn;

        return sqm;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;

        System.out.println(square(x,n));
    }
    
}

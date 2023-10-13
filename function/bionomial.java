public class bionomial {
    public static int fact(int n)
    {
        int f=1;
        if(n==1||n==0)
        {
            return n;
        }

        while(n!=1)
        {
            f=f*n;
            n=n-1;
        }
        return f;

    }
    public static void main(String[] args) {
        int n=5;
        int r=2;

        int bionomialcof=fact(n)/(fact(r)*fact(n-r));

        System.out.println(bionomialcof);
    }
}

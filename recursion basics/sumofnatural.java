public class sumofnatural {
    public static int natural(int n)
    {
        if(n==1)
        {
            return 1;
        }

        return n+natural(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(natural(n));
    }
    
}

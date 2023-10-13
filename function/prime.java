public class prime {
    public static boolean primeno(int n)
    {
        if(n==0||n==1)//zero is snot prime number
        {
            return false;
        }
       if(n==2)
       {
        return true;
       }

        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(primeno(n));
    }
    
}

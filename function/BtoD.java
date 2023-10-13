public class BtoD {
    public static void binarytodecimal(int n)
    {
        int pow=0;
        int lastdigit=0;
        while(n>0)
        {

        int remainder=n%10;
        lastdigit=lastdigit+(remainder*(int)Math.pow(2, pow));
        pow++;
         n=n/10;

        
        }
        System.out.println(lastdigit);
    }
    public static void main(String[] args) {
        int n=101;
        binarytodecimal(n);
    }
}

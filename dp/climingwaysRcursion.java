public class climingwaysRcursion {
    //climing ways by using recursion

    public static int  contways(int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        return contways(n-1)+contways(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(contways(n));
    }
}

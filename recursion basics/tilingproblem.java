public class tilingproblem {
    public static int tiling(int n)
    {
        //base
        if(n==0||n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        //vertical
        int fnm1=tiling(n-1);
        //horizontal
        int fnm2=tiling(n-2);

        int fnm=fnm1+fnm2;
        return fnm;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(tiling(n));
    }
    
}

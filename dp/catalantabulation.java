public class catalantabulation {
    public static int catalan(int n)
    {
        int dp[]=new int[n+1];

        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<n+1;i++)
        {
            for(int j=0;j<i-1+1;j++)
            {
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        print(dp);
        return dp[n];
    }
    public static void print(int dp[])
    {
        for(int i=0;i<dp.length;i++)
        {
           
            
                System.out.print(dp[i]+" ");
          
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(catalan(n));
    }
    
}

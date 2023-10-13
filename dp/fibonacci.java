public class fibonacci{
    public static int calfibonacci(int n,int dp[])
    {
        if(n==0||n==1)
        {
            return n;
        }

        if(dp[n]!=0)
        {
            return dp[n];
        }
        dp[n]=calfibonacci(n-1, dp)+calfibonacci(n-2, dp);

        return dp[n];
    }
    public static void main(String[] args) {
        int n=6;
        int dp[]=new int[n+1];

        System.out.println(calfibonacci(n,dp));
    }
}
public class wildCraftMatching {
    public static boolean matching(String S,String P,int n,int m)
    {
        boolean dp[][]=new boolean[n+1][m+1];

        dp[0][0]=true;

        for(int i=1;i<dp.length;i++)
        {
            dp[i][0]=false;
        }
        for(int j=1;j<dp[0].length;j++)
        {
            if(P.charAt(j-1)=='*')
            {
                dp[0][j]=dp[0][j-1];
            }
            else{
                dp[0][j]=false;
            }
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(S.charAt(i-1)==P.charAt(j-1)||P.charAt(j-1)=='?')
                {
                    dp[i][j]=dp[i-1][j-1];

                }
                else if(P.charAt(j-1)=='*')
                {
                    dp[i][j]=dp[i][j-1]||dp[i-1][j];

                }
                else{
                    dp[i][j]=false;

                }
            }
        }
        print(dp);
        return dp[n][m];
    }
    public static void print(boolean  dp[][])
    {
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String S="abc";
        String P="**?b*";

        System.out.println(matching(S,P,S.length(),P.length()));
    }
    
}

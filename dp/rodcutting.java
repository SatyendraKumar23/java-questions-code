public class rodcutting {
    public static int rod(int prices[],int length[],int totallength)
    {
        int n=prices.length;

        int dp[][]=new int[n+1][totallength+1];

        for(int i=0;i<dp.length;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++)
        {
            dp[0][j]=0;
        }

        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<totallength+1;j++)
            {
                int price=prices[i-1];
                int L=length[i-1];

                if(L<=j)
                {
                    int include=price+dp[i][j-L];
                    int exclude=dp[i-1][j];

                    dp[i][j]=Math.max(include,exclude);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][totallength];
    }
    public static void print(int dp[][])
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
        int prices[]={1,5,8,9,10,17,17,20};
        int length[]={1,2,3,4,5,6,7,8};
        int totallength=8;

        System.out.println(rod(prices,length,totallength));
    }
    
}

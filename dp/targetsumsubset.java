public class targetsumsubset {
    public static boolean  subset(int numbers[],int targetsums)
    {
        boolean dp[][]=new boolean[numbers.length+1][targetsums+1];

        for(int i=0;i<dp.length;i++)
        {
            dp[i][0]=true;
        }
        for(int j=1; j<dp[0].length;j++)
        {
            dp[0][j]=false;
        }

        for(int i=1;i<numbers.length+1;i++)
        {
            for(int j=1;j<targetsums+1;j++)
            {
                int v=numbers[i-1];

                if(v<=j&&dp[i-1][j-v]==true)
                {
                    dp[i][j]=true;

                   
                }
                else if(dp[i-1][j]==true)
                {
                    dp[i][j]=true;
                }

            }
        }
        print(dp);
        return dp[numbers.length][targetsums];
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
        int numbers[]={4,2,7,1,3};
        int tar̥getsum=10;
        System.out.println(subset(numbers,tar̥getsum));
    }
    
}

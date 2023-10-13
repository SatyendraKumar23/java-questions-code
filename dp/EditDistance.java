public class EditDistance {
    public static int edit(String word1,String word2,int n,int m)
    {
        int dp[][]=new int[n+1][m+1];

        for(int i=0;i<dp.length;i++)
        {
            dp[i][0]=i;
        }
        for(int j=0;j<dp[0].length;j++)
        {
            dp[0][j]=j;
        }

        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(word1.charAt(i-1)==word2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    int add=dp[i][j-1]+1;
                    int remove=dp[i-1][j]+1;
                    int replace=dp[i-1][j-1]+1;

                    dp[i][j]=Math.min(add,Math.min(remove,replace));
                }
            }
        }
        print(dp);
        return dp[n][m];
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
        String word1="intention";
        String word2="execution";

        System.out.println(edit(word1,word2,word1.length(),word2.length()));
    }
    
}

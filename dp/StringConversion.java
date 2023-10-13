public class StringConversion {

    public static void strconversion(String str1,String str2)
    {
        int LCSlength=LCS(str1,str2);

        int deletion=str1.length()-LCSlength;
        int remainingword=str1.length()-deletion;
        System.out.println("deletion operation is: "+deletion);
          
        int insert=str2.length();
        int i=0;
        while(insert!=remainingword)
        {
            remainingword+=1;
            i++;
        }
        System.out.println("add opeartion are: "+ i );



    }
     public static int LCS(String str1,String str2)
    {
        int n=str1.length();
        int m=str2.length();

        int dp[][]=new int[n+1][m+1];

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
            for(int j=1;j<m+1;j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
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
        String str1="pear";
        String str2="sea";

        strconversion(str1,str2);
    }
    
}

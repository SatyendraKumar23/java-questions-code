import java.util.*;
public class Zeroand1knapsackmemonization {
    public static int knapsack(int val[],int wt[],int w,int i,int dp[][])
    {
        if(w==0||i==val.length)
        {
            return 0;
        }
        if(dp[i][w]!=-1)
        {
            return dp[i][w];
        }
        if(wt[i]<=w)
        {
            //include
            int ans1=val[i]+knapsack(val, wt, w-wt[i], i+1, dp);
            //exclude
            int ans2=knapsack(val, wt, w, i+1, dp);

            dp[i][w]=Math.max(ans1, ans2);
            return dp[i][w];
        }
        else
        {
            dp[i][w]=knapsack(val, wt, w, i+1, dp);
            return dp[i][w];
        }
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;

        int dp[][]=new int[val.length+1][w+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }

        System.out.println(knapsack(val,wt,w,0,dp));
    }
    
}

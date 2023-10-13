public class Zeroand1Snapsack {
    //0&1 knapsack
    public static int knapsack(int val[],int wt[],int w,int i)
    {
        int n=val.length;
        //base case
        if(w==0||i==n)
        {
            return 0;
        }

        if(wt[i]<=w)
        {
            //include
            int ans1=val[i]+knapsack(val, wt, w-wt[i], i+1);

            //exclude
            int ans2=knapsack(val, wt, w, i+1);

            return Math.max(ans1, ans2);
        }
        else{
            return knapsack(val, wt, w, i+1);
        }
    }

    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;

        System.out.println(knapsack(val,wt,w,0));
    }
    
}

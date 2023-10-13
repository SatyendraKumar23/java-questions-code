package arrays;

public class sellstock {
    public static void stock(int prices[])
    {
        int maxprofit=0;
        int  buyprice=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++)
        {
            if(buyprice<prices[i])
            {
                int profit=prices[i]-buyprice;

                maxprofit=Math.max(profit,maxprofit);
            }
            else{
                buyprice=prices[i];
            }
        }
        System.out.println(maxprofit);
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        stock(prices);
    }
    
}

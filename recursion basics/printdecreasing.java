public class printdecreasing {
    public static void decreasing(int n)
    {
        //base
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        //kaam

        System.out.println(n);
        //call
        decreasing(n-1);

    }

    public static void main(String[] args) {
        int n=20;
        decreasing(n);

    }
    
}

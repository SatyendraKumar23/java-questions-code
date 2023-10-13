public class friendspairing {
    public static int pairing(int n)
    {
        if(n==1||n==2)
        {
            return n;
        }
        //single

        int fn1=pairing(n-1);

        //pair
        int fn2=pairing(n-2);
        int totalwaysofpairing=(n-1)*fn2;

        //total ways
        int totalways=fn1+totalwaysofpairing;

        return totalways;
    }
    public static void main(String[] args) {
        int n=3;

        System.out.println(pairing(n));
    }
    
}

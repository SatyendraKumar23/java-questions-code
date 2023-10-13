public class DtoB {
    public static void decimaltobinary(int n)
    {
        int pow=0;
        int binarynum=0;

        while(n>0)
        {
            int remainder=n%2;
            binarynum=binarynum+(remainder*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println(binarynum);
    }
    public static void main(String[] args) {
        int n=12;
        decimaltobinary(n);
        
    }
    
}

package string;

public class path {
    public static float shortestpath(String path)
    {
        int x=0;
        int y=0;

        for(int i=0;i<path.length();i++)
        {
            char dist=path.charAt(i);

            if(dist=='s')
            {
                y--;
            }
            else if(dist=='n')
            {
                y++;
            }
            else if(dist=='e')
            {
                x++;
            }
            else{
                x--;
            }

            
        }
        int x2=x*x;
            int y2=y*y;

            return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path="wneenesennn";
        System.out.println(shortestpath(path));

    }
    
}

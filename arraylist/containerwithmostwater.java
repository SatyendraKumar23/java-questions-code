import java.util.*;
public class containerwithmostwater {
    public static int storewater(ArrayList<Integer>height)
    {
        int maxwater=0;
        for(int i=0;i<height.size();i++)
        {
            for(int j=i+1;j<height.size();j++)
            {
                int htt=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int currwater=width*htt;

                maxwater=Math.max(currwater,maxwater);

            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storewater(height));
    }
    
}

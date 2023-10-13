import java.util.*;
public class floodFillAlgo{
    public static void helper(int image[][],int sr,int sc,int color,boolean vis[][],int originalcolor)
    {
        if(sr<0||sc<0||sr>=image.length||sc>=image[0].length||vis[sr][sc]||image[sr][sc]!=originalcolor)
        {
            return;
        }
        //left
        helper(image, sr, sc-1, color, vis, originalcolor);
        //right
        helper(image, sr, sc+1, color, vis, originalcolor);
        //up
        helper(image, sr-1, sc, color, vis, originalcolor);
        //down
        helper(image, sr+1, sc, color, vis, originalcolor);

    }

    public static int floodfill(int image[][],int sr,int sc,int color)
    {
        boolean vis[][]=new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    public static void main(String[] args) {
        int image[][]={{1,1,1},{1,1,0},{1,0,1}};
        int sr=1;
        int sc=1;
        int color=2;
        System.out.println(floodfill(image,sr,sc,color));
        
    }
}
import java.util.*;
public class lowestCommonAncestor {
    static class node{
        int data;
        node left;
        node right;

        node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean getpath(node root,int n,ArrayList<node>path)
    {
        if(root==null)
        {
            return false;
        }
        path.add(root);
        if(root.data==n)
        {
            return true;
        }

        boolean foundleft=getpath(root.left, n, path);
        boolean foundright=getpath(root.right, n, path);

        if(foundleft||foundright)
        {
            return true;
        }
        else{
            path.remove(path.size()-1);
        }
        return false;
    }
    public static node lca(node root,int n1,int n2)
    {
        ArrayList<node>path1=new ArrayList<>();
        ArrayList<node>path2=new ArrayList<>();

        getpath(root,n1,path1);
        getpath(root,n2,path2);
        int i=0;

        for(;i<path1.size()&&i<path2.size();i++)
        {
            if(path1.get(i)!=path2.get(i))
            {
                break;
            }

            
        }
        node lca=path1.get(i-1);
            return lca;
        
    }
    public static node lca2(node root,int n1,int n2)
    {
        if(root==null||root.data==n1||root.data==n2)
        {
            return root;
        }
        node leftpath=lca2(root.left, n1, n2);
        node rightpath=lca2(root.right, n1, n2);

        if(leftpath==null)
        {
            return rightpath;
        }
        if(rightpath==null)
        {
            return leftpath;
        }
        return root;
    }
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);

        int n1=4;
        int n2=5;
        System.out.println(lca(root,n1,n2).data);
        
        System.out.println(lca2(root,n1,6).data);
    }
    
}

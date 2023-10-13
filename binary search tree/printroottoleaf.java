import java.util.*;
public class printroottoleaf {
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
    public static void printpath(ArrayList<Integer>path)
    {
        for(int i=0;i<path.size();i++)
        {
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }
    public static void printroot2leaf(node root,ArrayList<Integer>path)
    {
        if(root==null)
        {
            return;
        }
        path.add(root.data);
        if(root.left==null&&root.right==null)
        {
            printpath(path);
        }
        printroot2leaf(root.left, path);
        printroot2leaf(root.right, path);
        path.remove(path.size()-1);




    }
    public static void main(String[] args) {
         node root=new node(8);
        root.left=new node(5);
        root.right=new node(10);
        root.left.left=new node(3);
        root.left.right=new node(6);
        root.right.right=new node(11);

        printroot2leaf(root,new ArrayList<>());
    }
    
}

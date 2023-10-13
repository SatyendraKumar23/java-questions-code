import java.util.*;
public class subtreeofanothertree {
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
    public static boolean isidentical(node root,node subroot)
    {
        if(root==null&&subroot==null)
        {
            return true;
        }
        else if(root==null||subroot==null||root.data!=subroot.data)
        {
            return false;
        }
        if(!isidentical(root.left, subroot.left))
        {
            return false;
        }
        if(!isidentical(root.right, subroot.right))
        {
            return false;
        }
        return true;
    }
    public static boolean subtree(node root,node subroot)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==subroot.data)
        {
            if(isidentical(root,subroot))
            {
                return true;
            }
        }
        return subtree(root.left, subroot)||subtree(root.right, subroot);
    }
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);


        node subroot=new node(2);
        subroot.left=new node(4);
        subroot.right=new node(5);
        System.out.println(subtree(root,subroot));                                                                                 

    }
    
}

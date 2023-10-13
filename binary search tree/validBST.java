import java.util.*;
public class validBST {
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
    public static boolean checkvalid(node root,node min,node max)
    {
        if(root==null)
        {
            return true;
        }

        if(min!=null&&root.data<=min.data)//right
        {
            return false;
        }
        if(max!=null&&root.data>=max.data)//left
        {
            return false;
        }
        return checkvalid(root.left, min, root)&&checkvalid(root.right, root, max);

    }

    public static void main(String[] args) {
        node root=new node(8);
        root.left=new node(5);
        root.right=new node(9);
        root.left.left=new node(3);
        root.left.right=new node(6);

        if(checkvalid(root,null,null))
        {
            System.out.println("isvalid");
        }
        else{
            System.out.println("not valid");
        }
    }
    
}

import java.util.*;
public class convertBSTtobalancedBST {
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
    public static void getinorder(node root,ArrayList<Integer>inorder)
    {
        if(root==null)
        {
            return;
        }
        getinorder(root.left, inorder);
        inorder.add(root.data);
        getinorder(root.right, inorder);
        
    }
    public static node getbalanceBSt(ArrayList<Integer>inorder,int si,int ei)
    {
        if(si>ei)
        {return null;}

        int mid=(si+ei)/2;

        node root=new node(inorder.get(mid));
        root.left=getbalanceBSt(inorder, si, mid-1);
        root.right=getbalanceBSt(inorder, mid+1, ei);
        return root;
    }
    public static node createbst(node root)
    {
        ArrayList<Integer>inorder=new ArrayList<>();
        getinorder(root,inorder);

        root=getbalanceBSt(inorder,0,inorder.size()-1);
        return root;

    }
    public static void preorder(node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        node root=new node(8);
        root.left=new node(6);
        root.right=new node(10);
        root.left.left=new node(5);
        root.left.left.left=new node(3);
        
        root.right.right=new node(11);
        root.right.right.right=new node(12);

        root=createbst(root);
        preorder(root);



    }
    
}

import java.util.*;
public class merge2BST {
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
    public static void getinorder(node root,ArrayList<Integer>arr)
    {
        if(root==null)
        return;

        getinorder(root.left, arr);
        arr.add(root.data);
        getinorder(root.right, arr);
    }
    public  static node buildBST(ArrayList<Integer>arr,int si,int ei)
    {
        if(si>ei)
        {
            return null;
        }
        int mid=(si+ei)/2;
        node root=new node(arr.get(mid));
        root.left=buildBST(arr, si, mid-1);
        root.right=buildBST(arr, mid+1, ei);
        return root;
    }
    public static node mergeBST(node root1,node root2)
    {
        //inorder
        ArrayList<Integer>arr1=new ArrayList<>();
        getinorder(root1,arr1);

        ArrayList<Integer>arr2=new ArrayList<>();
        getinorder(root2, arr2);

        //sorted 
        ArrayList<Integer>finalarr=new ArrayList<>();

        int i=0;
        int j=0;

        while(i<arr1.size()&&j<arr2.size())
        {
            if(arr1.get(i)<=arr2.get(j))
            {
                finalarr.add(arr1.get(i));
                i++;
            }
            else{
                finalarr.add(arr2.get(j));
                j++;
            }

        }
        while(i<arr1.size())
        {
            finalarr.add(arr1.get(i));
                i++;
        }
        while(j<arr2.size())
        {
            finalarr.add(arr2.get(j));
                j++;

        }
        return buildBST(finalarr,0,finalarr.size()-1);
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

        node root1=new node(2);
        root1.left=new node(1);
        root1.right=new node(4);


        node root2=new node(9);
        root2.left=new node(3);
        root2.right=new node(12);

        node root=mergeBST(root1,root2);
        preorder(root);
        
    }
    
}

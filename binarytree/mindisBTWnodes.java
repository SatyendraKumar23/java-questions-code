public class mindisBTWnodes {
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
    public static node lca(node root,int n1,int n2)
    {
        if(root==null||root.data==n1||root.data==n2)
        {
            return root;
        }
        node leftpath=lca(root.left, n1, n2);
        node rightparth=lca(root.right, n1, n2);

        if(leftpath==null)
        {
            return rightparth;
        }
        if(rightparth==null)
        return leftpath;

        return root;
    }
    public static int dist(node root,int n)
    {
        if(root==null)
        {
            return-1;
        }
        if(root.data==n)
        {
            return 0;
        }
        int leftdist=dist(root.left, n);
        int rightdist=dist(root.right, n);

        if(leftdist==-1&&rightdist==-1)
        {
            return -1;
        }
        else if(leftdist==-1)
        {
            return rightdist+1;
        }
        else{
            return leftdist+1;
        }
    }
    public static int mindistance(node root,int n1,int n2)
    {
       node lca2=lca(root, n1, n2);

       int leftdist=dist(lca2,n1);
       int rightdist=dist(lca2,n2);

       return leftdist+rightdist;
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
        int n2=6;

        System.out.println(mindistance(root, n1, n2));
    }
    
}

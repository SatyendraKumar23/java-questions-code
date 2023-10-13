public class kthancestor {
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
    public static int ancestorkth(node root,int n,int k)
    {
        if(root==null)
        {
            return -1;
        }
        if(root.data==n)
        {
            return 0;
        }
        int leftdist=ancestorkth(root.left, n, k);
        int rightdist=ancestorkth(root.right, n, k);

        if(leftdist==-1&&rightdist==-1)
        {
            return -1;
        }
        int max=Math.max(leftdist, rightdist);
        if(max+1==k)
        {
            System.out.println(root.data);
        }

        return max+1;



    }
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);

        int n=5;
        int k=2;

        ancestorkth(root,n,k);
    }
    
}

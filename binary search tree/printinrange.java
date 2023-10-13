public class printinrange {
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
    public static void printinrangee(node root,int k1,int k2)
    {
        if(root==null)
        {
            return;
        }
        if(root.data>=k1&&root.data<=k2)
        {
            printinrangee(root.left, k1, k2);
            System.out.print(root.data+" ");
            printinrangee(root.right, k1, k2);
        }
        else if(root.data<k1)
        {
            printinrangee(root.left, k1, k2);
        }
        else{
            printinrangee(root.right, k1, k2);
        }

    }
    public static void main(String[] args) {
         node root=new node(8);
        root.left=new node(5);
        root.right=new node(10);
        root.left.left=new node(3);
        root.left.right=new node(6);
        root.right.right=new node(11);

        printinrangee(root, 5, 12);
   
    }
}

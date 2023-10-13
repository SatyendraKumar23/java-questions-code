public class sizeofLArgestBst {
    static class node{
        int data;
        node left;
         node right;
         public node(int data)
         {
            this.data=data;
            this.left=null;
            this.right=null;
         }

    }
    static class info{
        boolean isBST;
        int size;
        int min;
        int max;

        info(boolean isBST,int size,int min,int max)
        {
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public static int maxbst=0;

    public static info largest(node root)
    {
        if(root==null)
        {
            return new info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        info leftlargest=largest(root.left);
        info rightlargest=largest(root.right);
        int size=leftlargest.size+rightlargest.size+1;
        int min=Math.min(root.data,Math.min(leftlargest.min,rightlargest.min));
        int max=Math.max(root.data,Math.max(leftlargest.max,rightlargest.max));

        if(leftlargest.max>=root.data||rightlargest.min<=root.data)
        {
            return new info(false, size, min, max);
        }
        if(leftlargest.isBST&&rightlargest.isBST)
        {
            maxbst=Math.max(size, maxbst);
            return new info(true, size, min, max);
        }
        return new info(false, size, min, max);


    }
    public static void main(String[] args) {
         node root=new node(50);
        root.left=new node(30);
        root.right=new node(60);
        root.left.left=new node(5);
        root.left.right=new node(20);
        root.right.left=new node(45);
        root.right.right=new node(70);
        root.right.right.left=new node(65);
        root.right.right.right=new node(80);

        info Info=largest(root);

        System.out.println(maxbst+" ");
    }
    
}

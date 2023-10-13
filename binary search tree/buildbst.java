public class buildbst{
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
    public static  node insert(node root,int values)
    {
        if(root==null)
        {
            root=new node(values);
            return root;
        }
        if(root.data>values)
        {
            root.left=insert(root.left,values);

        }
        if(root.data<values)
        {
            root.right=insert(root.right,values);
        }

        return root;
    }
    public static void inorder(node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        node root=null;

        for(int i=0;i<values.length;i++)
        {
            root=insert(root,values[i]);
        }
        inorder(root);

    }
}
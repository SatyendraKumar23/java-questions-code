public class mirrorBst {
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
    public static node mirror(node root)
    {
        if(root==null)
        {
            return null;
        }
        node mirrorleft=mirror(root.left);
        node mirrorright=mirror(root.right);

        root.left=mirrorright;
        root.right=mirrorleft;

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
        root.left=new node(5);
        root.right=new node(9);
        root.left.left=new node(3);
        root.left.right=new node(6);

        root=mirror(root);
        preorder(root);

    }
    
}

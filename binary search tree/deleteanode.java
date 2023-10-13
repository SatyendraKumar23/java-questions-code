public class deleteanode {
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
    public static node delete(node root,int val)
    {
        if(root.data>val)
        {
            root.left=delete(root.left, val);
        }
        else if(root.data<val)
        {
            root.right=delete(root.right, val);
        }
        else{
            //case 1 no child

            if(root.left==null&&root.right==null)
            {
                return null;
            }

            //case2 single child deletion

            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            else{
                //two child

                node IS=findinordersuccssor(root.right);//left most node in right subtree
                root.data=IS.data;
                root.right=delete(root.right, IS.data);
            }
        }
        return root;
    }
    public static node findinordersuccssor(node root)
    {
        while(root.left!=null)
        {
            root=root.left;
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
        node root=new node(8);
        root.left=new node(5);
        root.right=new node(10);
        root.left.left=new node(3);
        root.left.right=new node(6);
        root.right.right=new node(11);
        delete(root, 5);
        inorder(root);
    }
    
}

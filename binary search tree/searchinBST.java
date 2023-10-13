public class searchinBST {
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
    public static boolean search(node root,int key)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==key)
        {
            return true;
            
        }
        if(root.data>key)
        {
            return search(root.left,key);
        }
        else{
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        node root=new node(8);
        root.left=new node(5);
        root.right=new node(10);
        root.left.left=new node(3);
        root.left.right=new node(6);
        root.right.right=new node(11);

        System.out.println(search(root,1));
    }
    
}

public class klevel {
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
    public static void level(node root,int levell,int k){
        if(root==null)
        {
            return;
        }
        if(levell==k)
        {
            System.out.println(root.data);
            return;
        }
        level(root.left, levell+1, k);
        level(root.right, levell+1, k);
    }
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);

        level(root,1,2);
    }
    
}

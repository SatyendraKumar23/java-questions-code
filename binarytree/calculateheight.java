public class calculateheight {
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
   // public static int height(node root)
   // {
    //    if(root==null)
    //    {
      //      return 0;
    //    }
      //  int lh=height(root.left);
      //  int rh=height(root.right);

      //  return Math.max(lh,rh)+1;
   // }
    //we can also find the traversal here easly by this method
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
//count of nodes
    public static int countnodes(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftcount=countnodes(root.left);
        int rightcount=countnodes(root.right);
        int count=leftcount+rightcount+1;


        return count;
    }
    //sum of nodes
    public static int sumofnodes(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftsum=sumofnodes(root.left);
        int rightsum=sumofnodes(root.right);

        int sum=leftsum+rightsum+root.data;
        return sum;
    }
    //diameter of tree
    public static int diameter(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftdiameter=diameter(root.left);
        int rightdiameter=diameter(root.right);

        int leftheight=height(root.left);
        int rightheight=height(root.right);

        int sumheight=leftheight+rightheight+1;

        return Math.max(leftdiameter,Math.max(rightdiameter,sumheight));
    }
    //optiomize diameter of treee

    static class info{
        int  diam;
        int ht;

        info(int diam,int ht)
        {
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static info diameteroptimize(node root)
    {
        if(root==null)
        {
            return new info(0, 0);
        }
        info leftinfo=diameteroptimize(root.left);
        info rightinfo=diameteroptimize(root.right);

        int diameter=Math.max(Math.max(leftinfo.diam,rightinfo.diam),leftinfo.ht+rightinfo.ht+1);
        int height=Math.max(leftinfo.ht,rightinfo.ht)+1;

        return new info(diameter, height);
    }
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);

        System.out.println("height is:"+ height(root));
        inorder(root);
        System.out.println();

        System.out.println("count: "+countnodes(root));

        System.out.println("sum is: "+ sumofnodes(root));

        System.out.println("max diameter: "+ diameter(root));


        System.out.println("diameter optimize: "+ diameteroptimize(root).diam);
        
    }
    
}

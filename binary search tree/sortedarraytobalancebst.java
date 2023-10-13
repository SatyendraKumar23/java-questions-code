public class sortedarraytobalancebst {
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
    public static node sortedbst(int arr[],int si,int ei)
    {
        if(si>ei)
        {
            return null;
        }
        int mid=(si+ei)/2;
        node root=new node(arr[mid]);
        root.left=sortedbst(arr, si, mid-1);
        root.right=sortedbst(arr, mid+1, ei);
        return root;
    }

    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
        node root=sortedbst(arr,0,arr.length-1);
        preorder(root);
    }
}

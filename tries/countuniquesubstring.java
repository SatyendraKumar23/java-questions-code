public class countuniquesubstring {
    static public class node{
        node children[];
        boolean eow;

        node()
        {
            children=new node[26];
            for(int i=0;i<26;i++)
            {
                children[i]=null;
            }
            eow=false;


        }
    }
    static node root=new node();
    public static void insert(String words)
    {
        node curr=new node();
        for(int i=0;i<words.length();i++)
        {
            int idx=words.charAt(i)-'a';

            if(curr.children[idx]==null)
            {
                curr.children[idx]=new node();
            }
            if(i==words.length()-1)
            {
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }

    }
    public static boolean search(String key)
    {
        node curr=root;
        for(int i=0;i<key.length();i++)
        {
            int idx=key.charAt(i)-'a';

            if(curr.children[idx]==null)
            {
                return false;
            }
            if(i==key.length()-1&&curr.children[idx].eow==true)
            {
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public static int countnode(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(root.children[i]!=null){
            count+=countnode(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String str="ababa";

        for(int i=0;i<str.length();i++)
        {
            String Suffix=str.substring(i);
            insert(Suffix);
        }
        System.out.println(countnode(root));

    }
    
}

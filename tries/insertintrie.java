public class insertintrie {
   static public class node{
        node children[];
        boolean eow;

        public node()
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
        node curr=root;
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
            if(i==key.length()-1&&curr.children[idx].eow==false)
            {
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    //word break problem

    public static boolean wordbreak(String key)
    {
        if(key.length()==0)
        {
            return true;
        }
        for(int i=1;i<=key.length();i++)
        {
            String firstpart=key.substring(0, i);
            String secondpart=key.substring(i);

            if(search(firstpart)&&wordbreak(secondpart))
            {
                return true;
            }
        }
        return false;
    }
    //prefix problem

    public static boolean startwithproblem(String key)
    {
        node curr=root;
        for(int i=0;i<key.length();i++)
        {
            int  idx=key.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
  
    public static void main(String[] args) {
        String words[]={"i","am","like","samsung","any"};
        String key="sam";
        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }

        System.out.println(startwithproblem(key));
        
    }
    
}

public class duplicatestring {
    public static void duplicate(String str,int idx,StringBuilder sb,Boolean map[])
    {
        //base
        if(idx==str.length())
        {
            System.out.println(sb);
            return;
        }

        char currchar=str.charAt(idx);

        if(map[currchar-'a']==true)
        {
            duplicate(str, idx+1, sb, map);
        }
        else{
            map[currchar-'a']=true;
            duplicate(str, idx+1,  sb.append(currchar),map);
        }

    }
    public static void main(String[] args) {
        String str="satyendrakumar";
        int idx=0;
         StringBuilder sb=new StringBuilder(" ");
        Boolean map[]=new Boolean[26];
       
        duplicate(str, idx,sb,map);
    }
    
}

import java.util.*;
public class palindrome {
    public static class node{
        int data;
        node next;

        public node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node findmid(node head)
    {
        node fast=head;
        node slow=head;

        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static boolean checkpalindrome()
    {
        if(head==null&&head.next==null)
        {
            return true;
        }
        node mid=findmid(head);
        node prev=null;
        node curr=mid.next;
        node next;
        while(mid!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node left=head;
        node right=prev;

        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return true;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }
    public static void main(String[] args) {

       head=new node(1);
        head.next=new node(2);
        head.next.next=new node(1);
        System.out.println(checkpalindrome());


        
    }
    
}

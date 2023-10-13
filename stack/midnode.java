import java.util.*;
public class midnode{
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
    public static node tail;
    public static node findmid()
    {
        node slow=head;
        node fast=head;

        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
    public static void main(String[] args) {
        
        head=new node(1);
        head.next=new node(2);
        head.next.next=new node(3);
        System.out.println(findmid());

        
    }
}
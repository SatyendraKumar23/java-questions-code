import java.util.*;
public class stackusingtwoqueue {
    static class stack{
        static Queue<Integer>q=new LinkedList<>();
        static Queue<Integer>q2=new LinkedList<>();

        public static boolean isEmpty()
        {
            return q.isEmpty()&&q2.isEmpty();
        }
        public static void push(int data)
        {
            if(!q.isEmpty())
            {
                q.add(data);
            }
            else{
                q2.add(data);
            }
        }
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=-1;
            if(!q.isEmpty())
            {
                while(!q.isEmpty())
                {
                    top=q.remove();
                    if(q.isEmpty())
                    {
                        break;
                    }
                    q2.add(top);
                }

            }
            else{
                while(!q2.isEmpty())
                {
                    top=q2.remove();
                    if(q2.isEmpty())
                    {
                        break;
                    }
                    q.add(top);
                }
            }
            return top;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=-1;
            if(!q.isEmpty())
            {
                while(!q.isEmpty())
                {
                    top=q.remove();
                    
                    q2.add(top);
                }

            }
            else{
                while(!q2.isEmpty())
                {
                    top=q2.remove();
                    q.add(top);
                }
            }
            return top;

        }
    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
    
}
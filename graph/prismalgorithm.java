import java.util.*;
public class prismalgorithm{
    static class edge{
        int  src;
        int dest;
        int wt;

        public edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void createdgraph(ArrayList<edge>graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new edge(0,2,15));
        graph[0].add(new edge(0,1,10));
        graph[0].add(new edge(0,3,30));

        graph[1].add(new edge(1,0,10));
        graph[1].add(new edge(1,3,40));

        graph[2].add(new edge(2,0,15));
        graph[2].add(new edge(2,3,50));

        graph[3].add(new edge(3,2,50));
        graph[3].add(new edge(3,1,40));

    }
    static class pair implements Comparable<pair>{
        int ver;
        int cost;

        public pair(int v,int c )
        {
            this.ver=v;
            this.cost=c;
        }
        @Override
        public int compareTo(pair p2)
        {
            return this.cost-p2.cost;
        }

    }
    public static void prism(ArrayList<edge>graph[])
    {
        boolean vis[]=new boolean[graph.length];
        PriorityQueue<pair>pq=new PriorityQueue<>();
        pq.add(new pair(0,0));
        int finalcost=0;

        while(!pq.isEmpty())
        {
            pair curr=pq.remove();

            if(!vis[curr.ver])
            {
                vis[curr.ver]=true;
                finalcost+=curr.cost;
            
            //neighbour
            for(int i=0;i<graph[curr.ver].size();i++)
            {
                edge e=graph[curr.ver].get(i);

                pq.add(new pair(e.dest,e.wt));
            }
            }
        }
        System.out.println("final cost is"+finalcost);
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<edge>graph[]=new ArrayList[V];
        createdgraph(graph);
        prism(graph);
        
    }
}
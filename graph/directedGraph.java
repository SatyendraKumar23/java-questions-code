import java.util.*;
public class directedGraph{
    static class edge{
        int src;
        int dest;

        public edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
        }
    }
    public static void createdgraph(ArrayList<edge>graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new edge(0,2));
        graph[1].add(new edge(1,0));
        graph[2].add(new edge(2,3));
        graph[3].add(new edge(3,0));
    }
    public static boolean cycle(ArrayList<edge>graph[])
    {
        boolean vis[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];

        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                if(cycleutil(graph,i,vis,stack))
                {
                    return true;
                }
            }
        }
        return false;

    }
    public static boolean cycleutil(ArrayList<edge>graph[],int curr,boolean vis[],boolean stack[])
    {
        vis[curr]=true;
        stack[curr]=true;

        for(int i=0;i<graph[curr].size();i++)
        {
            edge e=graph[curr].get(i);

            if(stack[e.dest])
            {
                return true;
            }
            if(!vis[e.dest]&&cycleutil(graph,e.dest,vis,stack))
            {
                return true;
            }

        }
        stack[curr]=false;
        return false;
    }

    public static void main(String[] args) {
        int v=4;
        ArrayList<edge>graph[]=new ArrayList[v];
        createdgraph(graph);

        System.out.print(cycle(graph));
        
    }
}
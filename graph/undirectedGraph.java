import java.util.*;
public class undirectedGraph {
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
        //oth graph
        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,2));
        graph[0].add(new edge(0,3));

        //1st graph
        graph[1].add(new edge(1,0));
        graph[1].add(new edge(1,2));
        //2nd
        graph[2].add(new edge(2,0));
        graph[2].add(new edge(2,1));
        //3rd
        graph[3].add(new edge(3,0));
        graph[3].add(new edge(3,4));
        //4rth
        graph[4].add(new edge(4,3));
    }
    public static boolean cycledetection(ArrayList<edge>graph[])
    {
        
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                if(cycledetectionutil(graph,vis,i,-1))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean cycledetectionutil(ArrayList<edge>graph[],boolean vis[],int curr,int parent)
    {
        vis[curr]=true;

        //neighbour
        for(int i=0;i<graph[curr].size();i++)
        {
            edge e=graph[curr].get(i);

            if(!vis[e.dest]){
                if(cycledetectionutil(graph, vis, e.dest, curr))
                return true;
            }
            else if(vis[e.dest]&&e.dest!=parent)
            {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<edge>graph[]=new ArrayList[5];
        createdgraph(graph);
        System.out.println(cycledetection(graph));
        
    }
    
}

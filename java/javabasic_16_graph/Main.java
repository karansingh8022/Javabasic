import java.util.*;

public class Main{
    static class Edge{
        int src;
        int dest;
        int wt;
        
        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    
    public static void dfsSearch(ArrayList<Edge> graph[], boolean vis[], int i){
        vis[i] = true;
        
        System.out.print(i + " ");
        
        for(int j = 0; j<graph[i].size(); j++){
            Edge e = graph[i].get(j);
            if(vis[e.dest] == false){
                dfsSearch(graph, vis, e.dest);
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[], int v){
        boolean vis[] = new boolean[v];
        
        for(int i = 0; i<v; i++){
            if(vis[i] == false){
                dfsSearch(graph, vis, i);
            }
        }
    }
    
    
    public static void bfs(ArrayList<Edge> graph[], int v){
        boolean vis[] = new boolean[v];
        
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        vis[0] = true;
        
        while(!q.isEmpty()){
            int curr = q.peek();
            q.remove();
            
            System.out.print(curr + " ");
            ArrayList<Edge> list = graph[curr];
            
            for(int i = 0; i<list.size(); i++){
                Edge e = list.get(i);
                
                if(vis[e.dest] == false){
                    vis[e.dest] = true;
                    q.add(e.dest);
                }
            }
        }
    }
    
    
    public static void main(String args[]){
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        
        for(int i = 0; i<v; i++){
            graph[i] = new ArrayList<>();
        }
        
        graph[0].add(new Edge(0, 1, 5));
        
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
        
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 1, 3));
        
        graph[4].add(new Edge(4, 2, 2));
        
        for(int i = 0; i<graph.length; i++){
            System.out.print(i + " : ");
    
            for(int j = 0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);
                System.out.print("{" + e.src + "," + e.dest + "," + e.wt + "}, ");
            }
            System.out.println();
        }
        
        dfs(graph, v);
        System.out.println();
        bfs(graph, v);
    }
}
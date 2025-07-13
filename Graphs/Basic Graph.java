import java.util.*;

public class Graph {
    public static class Edge{
        int src;
        int des;
        int wt;

        public Edge(int s, int d) {
            this.src = s;
            this.des = d;
            // this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void bfs(ArrayList<Edge> graph[], int V){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        q.add(0);
        vis[0] = true;
        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.println(curr + " ");

            for(int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if(!vis[e.des]) {
                    vis[e.des] = true;
                    q.add(e.des);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(vis[e.des] == false){
                dfs(graph, e.des, vis);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        // bfs(graph, V);
        // System.out.println();

        boolean vis[] = new boolean[V];
        dfs(graph, 0, vis);
        System.out.println();

        System.out.println("Graph representation");
        System.out.println("Ramesh");
        System.out.println("Graph is represented as an adjacency list where each vertex points to its edges.");
        System.out.println("For example, vertex 0 has edges to vertices 1 and 2, and so on.");

        // //Or if you want to print all edges for all vertices:
        // System.out.println("All edges:");
        // for(int i=0; i<V; i++){
        //     System.out.print("Vertex " + i + " -> ");
        //     for(int j=0; j<graph[i].size(); j++){
        //         Edge e = graph[i].get(j);
        //         System.out.print(e.des + " ");
        //     }
        //     System.out.println();
        // }
    }
}

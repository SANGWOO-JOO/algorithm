package BFS;

import java.io.*;
import java.util.*;

class Graph {
    private ArrayList<ArrayList<Integer>> graph;

    public Graph(int nodeSize) {
        graph = new ArrayList<>();

        for(int i = 0; i < nodeSize + 1; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public ArrayList<Integer> getNode(int n) {
        return graph.get(n);
    }

    public void put(int n, int m) {
        graph.get(n).add(m);
        graph.get(m).add(n);
    }

    public boolean isAdjacent(int n, int m) {
        for(int i = 0; i < graph.get(n).size(); i++) {
            if(graph.get(n).get(i) == m) return true;
        }
        return false;
    }

    public void graphSort(int n) {
        Collections.sort(graph.get(n));
    }
}

public class bi_깊이우선탐색과_너비우선탐색  {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static int node;
    private static int edge;

    private static Graph graph;
    private static boolean[] isVisitedDfs;
    private static boolean[] isVisitedBfs;

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());

        graph = new Graph(node);
        isVisitedDfs = new boolean[node + 1];
        isVisitedBfs = new boolean[node + 1];

        for(int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.put(a, b);
        }

        for(int i = 0; i < node; i++) {
            graph.graphSort(i);
        }

        dfs(0);
        System.out.println();
        bfs(0);

        br.close();
    }

    private static void dfs(int v) {
        isVisitedDfs[v] = true;
        System.out.print(v + " ");
        for(int i = 0; i < graph.getNode(v).size(); i++) {
            int w = graph.getNode(v).get(i);
            if(!isVisitedDfs[w]) dfs(w);
        }
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        isVisitedBfs[v] = true;
        System.out.print(v + " ");

        while(!queue.isEmpty()) {
            int w = queue.poll();

            for(int i = 0; i < node; i++) {
                if(graph.isAdjacent(i, w) && !isVisitedBfs[i]) {
                    queue.add(i);
                    isVisitedBfs[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}


//bi_깊이우선탐색과_너비우선탐색 
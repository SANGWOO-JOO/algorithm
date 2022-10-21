package BFS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/*
 시간 복잡도: O(n+m)
 공간 복잡도: O(n)
 사용한 알고리즘: BFS(너비 우선 탐색)
 사용한 자료구조: 인접 리스트
 */


public class BFS {
    static final int max_int = 10001;
    static int n, m, k, a, b;
    static int[] check = new int[max_int];
    static ArrayList<Integer> v[] = new ArrayList[max_int];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); //정점 
        m = Integer.parseInt(st.nextToken()); //간선
        k = Integer.parseInt(st.nextToken());

        for(int i=1; i<=n; i++) {
            check[i] = -1;
            v[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            v[a].add(b);
            v[b].add(a);
        }

        bfs();

        for(int i=1; i<=n; i++){
            System.out.println(check[i]);
        }
    }

    public static void bfs(){
        Queue<Integer> q = new LinkedList<>();
        check[k] = 0;
        q.add(k);

        while(!q.isEmpty()){
            int node = q.poll();

            for(int i=0; i<v[node].size(); i++){
                int next = v[node].get(i);

                if(check[next] == -1){
                    check[next] = check[node] + 1;
                    q.add(next);
                }
            }
        }
    }
}
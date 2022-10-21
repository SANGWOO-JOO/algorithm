package BFS;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class bi_목수의_미로_탈출{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int visited[][][] = new int[n][m][2];
        int map[][] = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                map[i][j] = sc.nextInt();

        int dx[] = { 1, 0, -1, 0 };
        int dy[] = { 0, 1, 0, -1 };
        Queue<node> q = new LinkedList<>();
        q.add(new node(n - 1, 0, 0));
        visited[n - 1][0][0] = 1;
        while (!q.isEmpty()) {
            node tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int x = tmp.x + dx[i];
                int y = tmp.y + dy[i];
                int b = tmp.b;
                if (x > -1 && x < n && y > -1 && y < m) {
                    if (map[x][y] == 1){
                       if(b == 0 && visited[x][y][b] == 0) {
                        visited[x][y][1] = visited[tmp.x][tmp.y][b] + 1;
                        q.add(new node(x, y, 1));
              }
                    } else{
                        if (visited[x][y][b] == 0) {
                            visited[x][y][b] = visited[tmp.x][tmp.y][b] + 1;
                            q.add(new node(x, y, b));
                        }
                    }
                }
            }
        }
          
        if(visited[0][m-1][1]==0)
            System.out.println(visited[0][m - 1][0] -1 );
        else if(visited[0][m-1][0]==0)
            System.out.println(visited[0][m - 1][1] -1);
        else
            System.out.println(Math.min(visited[0][m - 1][1], visited[0][m - 1][0]) -1);

    }

    public static class node {
        int x, y;
        int b;        //0: 벽 안 부순 것 1:벽 부순 것

        node(int x, int y, int b) {
            this.x = x;
            this.y = y;
            this.b = b;
        }
    }

}
package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bi_미로_찾기 {

	 private static int n;
     private static int m;

     private static int[][] arr;
     private static int[][] dist;
     private static boolean[][] isNotBroken;
     private static boolean[][] isBroken;
 
     private static int[] dy = {-1, 1, 0, 0};
     private static int[] dx = {0, 0, -1, 1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m =sc.nextInt();
		
		arr = new int[n][m];
        dist = new int[n][m];
        isNotBroken = new boolean[n][m];
        isBroken = new boolean[n][m];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        bfs(n-1, 0);
	}

	private static void bfs(int i, int j) {
		// TODO Auto-generated method stub
		 Queue<int[]> queue = new LinkedList<>();
         queue.add(new int[] {i, j, 0}); // 0은 한번도 부수지 않은 상태, 1은 한번 부순 상태
         isNotBroken[i][j] = true;
         
         while(!queue.isEmpty()) {
             if(dist[0][m-1] != 0 ) break;
             int[] w = queue.poll();
             for(int k = 0; k < 4; k++) {
                 int y = w[0] + dy[k];
                 int x = w[1] + dx[k];
                 int b = w[2];

                 if(y >= 0 && y < n && x >=0 && x < m) {
                     if(b == 1) { // 벽을 이미 한번 부순 상태
                         if(!isNotBroken[y][x] && !isBroken[y][x] && arr[y][x] == 0) {
                             queue.add(new int[]{y, x, 1});
                             dist[y][x] = dist[w[0]][w[1]] + 1;
                             isBroken[y][x] = true;
                         }
                     } else { // 한번도 벽을 부수지 않은 상태
                         if(!isNotBroken[y][x]) {
                             if(arr[y][x] == 0) queue.add(new int[] {y, x, 0});
                             else if(arr[y][x] == 1) queue.add(new int[] {y, x, 1});
                             dist[y][x] = dist[w[0]][w[1]] + 1;
                             isNotBroken[y][x] = true;
                         }
                     }
                 }
             }
         }
	}

}

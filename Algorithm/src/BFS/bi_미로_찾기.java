package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bi_미로_찾기 {

	 private static int n;
     private static int m;

     private static int[][] arr;
     private static boolean[][] isvisited;
 
     private static int[] dy = {-1, 1, 0, 0};
     private static int[] dx = {0, 0, -1, 1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); //세로
		m =sc.nextInt(); //가로
		
		arr = new int[n][m];
		isvisited = new boolean[n][m];
        
            for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        bfs(n-1, 0);
        System.out.println(arr[0][m-1]);
	}

	private static void bfs(int i, int j) {
		// TODO Auto-generated method stub
		 Queue<int[]> queue = new LinkedList<>();
         queue.add(new int[] {i,j});
         isvisited[i][j]=true;
         
         while(!queue.isEmpty()) {
        	 int[]w =queue.poll();
        	 
        	 for(int k=0;k<4;k++) {
        		 int y=w[0]+dy[k];
        		 int x=w[1]+dx[k];
        		 
        		 if(y>=0&&y<n&&x>=0&&x<m) {
        			 if(arr[y][x]==0&&!isvisited[y][x]) {
        				 queue.add(new int [] {y,x});
        				 isvisited[y][x]=true;
        				 arr[y][x] = arr[w[0]][w[1]]+1;
        			 }
        		 }
        		 
        	 }
         }
	}
}


package Dijkstra;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bi_최단거리 {
	
	static int n,m,a,b;
	static int start , end;
	static int arr [] = new int [10000];
	static boolean check[];
	static int result [];
	static ArrayList<Integer> v[] ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		n =sc.nextInt(); //정점
		m =sc.nextInt(); //간선
		
		
		 for(int i=1; i<=n; i++) {
			 v[i] = new ArrayList<>();
		 }
		 
		 for(int i=0; i<m; i++){
	           
	            a = sc.nextInt();
	            b = sc.nextInt();
	            v[a].add(b);
	            v[b].add(a);
	        }
		
		start = sc.nextInt();
		end = sc.nextInt();
		
		 
		 bfs(start ,end);
		 
		 System.out.print(arr[end]);
	}

	private static void bfs(int start, int end) {
		// TODO Auto-generated method stub
		
		 Queue<Integer> queue = new LinkedList<>();
		
		 check[start] = true;
		 
		 queue.add(start);
		 
		 while(!queue.isEmpty()) {
			 int node = queue.poll();
			 
			 for(int i=0; i<v[node].size();i++) {
				// 임의의 정점에서 연결되 다른 모든 정점들을 next에 넣습니다.
				 int next  =v[node].get(i);
				 
				 if(!check[next]){
                    arr[next] = arr[node] + 1;
                    arr[next] = node;
                    queue.add(next);
			 }
			 
			 
		 }
		 
		
	}

	}
}

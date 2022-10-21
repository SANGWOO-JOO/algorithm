package Part8_자료구조_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Part10_이분_그래프_판별 {

	static ArrayList<Integer>[] A;
	static int[] check;
	static boolean[] visited;
	static boolean IsEven;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			String[]s = br.readLine().split(" ");
			//V ,E 
			int V = Integer.parseInt(s[0]); // 정점
			int E = Integer.parseInt(s[1]); // 간선 
			
			A = new ArrayList[V+1]; // 인접리스트 초기화
			
			visited =new boolean[V+1];
			check = new int [V+1];
			
			IsEven = true; // 이분 그래프인지를 판별
			for(int i=1;i<=V;i++) {
				A[i]=new ArrayList<Integer>();
			}
			
			// 에지 데이터 저장하기
			for(int i =0; i<E;i++) {
				s=br.readLine().split(" ");
				// 두 개 노드 . 
				int Start =Integer.parseInt(s[0]);
				int End = Integer.parseInt(s[1]);
				//방향 없으면 둘다 더해줘야 됨 ..
				A[Start].add(End);
				A[End].add(Start);
			}
			
			for(int i=1;i<=V;i++) {
				if(IsEven)
					DFS(1);
				else
					break;
			}
//			check[1]=0;
			if(IsEven) {
				System.out.print("YES");
			}
			else
				System.out.print("NO");
			
		}
	

	private static void DFS(int start) {
		// TODO Auto-generated method stub
		visited[start]=true;
		
		for(int i : A[start]) {
			if(!visited[i]) {
				check[i] =(check[start]+1)%2;
				DFS(i);
			}
			
			else if(check[start]==check[i]) {
				IsEven =false;
			}
			
		}
	}
}

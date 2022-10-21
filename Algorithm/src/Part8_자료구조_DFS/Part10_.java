package Part8_자료구조_DFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import Part8_자료구조_Stack_Queue.stack_스택개념;

public class Part10_ {
	static int n; // 지도의 크기
	static int[][] map; // 단지정보를 담고있는 배열
	static boolean[][] visited; // 방문 정보를 담고 있는 배열
	static int[][] pos = {{-1,0},{1,0},{0,-1},{0,1}};// 상하좌우
	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		n= sc .nextInt();
		map = new int[n][n]; // 지도를 생성
		visited = new boolean[n][n]; // visited 객체생상
		
		for(int i=0 ; i<n;i++) {
			 String str = sc.next();
			 
			 for(int j =0 ; j< n;j++) {
				 map[i][j]=str.charAt(j)-'0';
			 }
		}
		
		ArrayList<Integer> resultList =new ArrayList<>();
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
				if(map[i][j]==1 && !visited[i][j]) {
					count =0;
					dfs(i, j);
					
					resultList.add(count);
					
				}
			}
		}
		
		System.out.println(resultList.size());
		Collections.sort(resultList);
		
		//향상된 for문
		for(Integer integer : resultList) {
			System.out.println(integer); //sysout
		}
	}

	private static void dfs(int r, int c) {
		// TODO Auto-generated method stub
		count ++ ; // 단지 정보를 호출할때 마다 카운트
		visited[r][c] =true;
		//상하좌우 탐색
		for (int i = 0; i < pos.length; i++) {
			int nr = r + pos[i][0];
			int nc = c + pos[i][1];
			
			//1. 배열의 조건을 만족하는지 nr>=0&&nr<n&&nc>=0&&nc<n&
			//2. 단지가 연결이 되었는지 map[nr][nc]==1
			//3. 방문을 하지 않은곳이 이었을떄 !visited[nr][nc]
			
			if(nr>=0&&nr<n&&nc>=0&&nc<n&&map[nr][nc]==1&&!visited[nr][nc]) {
				dfs(nr ,nc);
			}
		}
	}

}

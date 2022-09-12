package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Part4_2_2 {

	

	static int r;
	static int c;
	static int k;
	
	//상우좌하
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int c = Integer.parseInt(st.nextToken());
    	int r = Integer.parseInt(st.nextToken());
		
    	
		/*
		 * 1. 좌석 배열 선언
		 */
		
		// 테두리를 -1 처리해줌 
		int [][] arr  = new int [r+2][c+2];
		
		for(int i = 0;i<(c+2);i++) {
			arr[0][i]=-1;
			arr[r+1][i]=-1;
		}
		
		for(int i = 0;i<(r+2);i++) {
			arr[i][0]=-1;
			arr[i][c+1]=-1;
		}
		
		int k = Integer.parseInt(br.readLine());
		
		/*
		 * 2. 좌석 배치
		 */
		
		int x =r; // 현재 x좌표
		int y=1;  // 현재 y좌표
		int value = 1; //좌석
		int dir =0; // 방향(상우하좌) => 0123~
		
		while(true) {
			arr[x][y] =value;
			
			// 대기번호 k 관객 좌석 위치 출력	
			
			if(value ==k) {
				System.out.print(y+" "+(r-x+1));
				break;
			}
			
			// 이미 채워져있거나 벽을 만날때마다 방향 전환
    		if(arr[x + dx[dir]][y + dy[dir]] != 0) {
    			dir = (dir + 1) % 4;
    		}
    		x += dx[dir];
    		y += dy[dir];
    		
    		value++;

		}
				
	}

}

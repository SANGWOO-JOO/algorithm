package 완전탐색;

import java.util.Scanner;

public class Part3_3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 맵 크기 .. 
		int n;
		// 유닛의 좌
		int y,x,c;
		// 2차원 배열에서 아무값도 넣지 않으면 0으로 초기화
		int[][] arr = new int[105][105];
		
		Scanner sc =new Scanner(System.in);
		
		n =sc.nextInt();
		
		y =sc.nextInt();
		x =sc.nextInt();
		//거리
		c =sc.nextInt();
		
		//좌표가 1부터 시작 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			// 1  i,j ~ y,x 의 거리를 구해야한다	
			// 2 이 거리가 c안에 들어오는가?? 
				
			int first =i-y;
			int second =j-x;
			
			//거리가 음수가 나올떄 
			if(first<0)first*=-1;
			if(second<0)second*=-1;
			
			int dist = first + second;
			
			if(dist==0) 
				arr[i][j]=-1;
			/*
			 * 이 부분 선언이 잘못 된거 같은데 ...
			   어디서 잘못된 것일까?? 
			 */
	
			else if(dist<=c) {
				arr[i][j]=dist;
			}
				
			}
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(arr[i][j]==-1)
					System.out.print("x"+" ");
				else
					System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
	}

}

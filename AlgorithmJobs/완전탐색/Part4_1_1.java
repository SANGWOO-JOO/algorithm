package 완전탐색;

import java.util.Scanner;

//bingo

public class Part4_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int[][] arr;
		arr  = new int[5][5];
		
		
		// 빙고판에 들어갈 값 받기 
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		int order=0;
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<5;j++) {
				// 빙고판에서 숫자 판별하기 
				int discrimination = sc.nextInt();
				order++;
				// 1) a의 위치를 찾아야 한다.
				// 2) a를 지워야한다.
				// 3) 몇 개의 줄이 지금까지 지워졌는지를 파악한다.
				// 4) 3개 이상의 줄이 지워졌다면 끝
				
				

				for(int k=0;k<5;k++) {
					for(int p=0;p<5;p++) {
						
						if(arr[k][p]==discrimination) {
							// (k,p)에 a가 있구나!
							arr[k][p]=-1;
						}						
					}
				}
				// 총 줄의 갯수 
				int count = 0 ;
				
				//가로 빙고 구하기 
				for(int k=0;k<5;k++) {
					
					//x를 담을 변수 
					int xcnt=0;
					//k번째 줄에 x의 갯수를 세겠다
					for(int p=0;p<5;p++) {
						if(arr[k][p]==-1) {
							xcnt++;
						}
					}
						if(xcnt==5)count++;
					
				}
				
				//세로 빙고 구하기 
					for(int k=0;k<5;k++) {
					
					//x를 담을 변수 
					int ycnt=0;
					//k번째 줄에 x의 갯수를 세겠다
					for(int p=0;p<5;p++) {
						if(arr[p][k]==-1) {
							ycnt++;
						}
					}
					if(ycnt==5)count++;
					}
					
					//대각선 빙고 구하기 
					
					if(arr[0][0]==-1&&arr[1][1]==-1&&arr[2][2]==-1&&arr[3][3]==-1&&arr[4][4]==-1)
						count++;
					if(arr[0][4]==-1&&arr[1][3]==-1&&arr[2][2]==-1&&arr[3][1]==-1&&arr[4][0]==-1)
						count++;
				
					
					if(count>=3) {
					 System.out.print(order);
					 //return 0; 과 같은 프로그램 종료
					 System.exit(0); 	
					}
					
			}
		}
		
		
	}
}

package 완전탐색;

import java.util.Scanner;

//tetris


public class Part4_2_1 {
	
	
	public static void main(String[] args) {
		
		
		int [][]arr=new int[40][40];
		
		Scanner sc = new Scanner(System.in);
		int r,c;
		r=sc.nextInt();
		c=sc.nextInt();
		
		//주어진 c(가로)와 r(세로)값에 따라 대입 => 초기 테트리스 구성
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		//들어가는 열 배열로 넣기!! 	
		int []xx=new int[100];
		int []yy=new int[100];
		int x = 0 , y = 0;
		
		
		
		
		
		for(int i=0;i<r;i++) {
			
				for(int j=0;j<c;j++) {	
					
					 if(arr[i][j] == 1) {
						 xx[0]=j;
						 yy[0]=i;
					}
				}
			}
		
		
		
//		for(int j=0;j<c;j++) {
//			if(arr[r][j]==0) {
//				xx[0]=j;
//				yy[0]=r;
//			}
//		}
		
		System.out.print(xx[0]);
		System.out.print(yy[0]);
			
			
		 
	}

}

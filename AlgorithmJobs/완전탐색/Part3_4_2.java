package 완전탐색;

import java.util.Scanner;

public class Part3_4_2 {

	public static void main(String[] args) {

		int n=0; // 색종이  수
		int a; //알랩이
		int b; //상대의 룩
		int c; //기물
		
		int kingx=0, kingy=0;
		int rookx,rooky;
		int otherx,othery;
		
		int rookcount=0; // 룩 최대 갯수는 두개
		int kingcount=0;
		int othercount=0;
		
		int answera = 0,answerb=0,answerc=0,answerd=0;

		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[8][8];
		
		//입력
		
	
			for(int i=0;i<8;i++) {
				 for(int j=0;j<8;j++) {
					 arr[i][j] =sc.nextInt();
					 
				if(arr[i][j]==1) {
					// king의 좌표
					kingy=i; // y
					kingx=j;  //x
					kingcount++;
				}				
				
				if(arr[i][j]==2) {
					rooky=i;
					rookx=j;
					rookcount++;
				}
				
				if(arr[i][j]==3) {
					othery=i;
					otherx=j;
					othercount++;
				}
			
			 }	 
		    }
			
			for(int i=1;i<=8;i++) {
				
				if(rookcount<=2 || kingcount == 1 || othercount<=29) {
					
					if(kingx-i==2) {
						for(int j=1;j<8-i;j++)
						if(kingx-i!=3) {	
							System.out.print(1);
							break;
						}
					}
					
					else if(kingx+i==2) {
						for(int j=1;j<8-i;j++)
						if(kingx+i!=3) {	
							System.out.print(1);
							break;
						}
					}
	
					
					else if(kingy+i==2) {
						for(int j=1;j<8-i;j++)
						if(kingy+i!=3) {	
							System.out.print(1);
							break;
						}
					}
					
					else if(kingy-i==2) {
						for(int j=1;j<8-i;j++)
						if(kingy-i!=3) {	
							System.out.print(1);
							break;
						}
					}
					
					else {
						System.out.print(0);
						break;
					}
									
				}				
			}
			
 }}



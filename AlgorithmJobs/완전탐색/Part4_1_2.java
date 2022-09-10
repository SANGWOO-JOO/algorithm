package 완전탐색;

import java.util.Scanner;

//	baseball game


public class Part4_1_2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int information[][] = new int[105][3];
		int result=0;
		int n;
		//몇개의 줄이 들어가는가?
		
		n = sc.nextInt();
		
		// 입력
		for(int i=0;i<n;i++) {
			information[i][0] = sc.nextInt();
			information[i][1] = sc.nextInt();
			information[i][2] = sc.nextInt();
		}
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				for(int k=1;k<=9;k++) {
		
					// i j k
					
					if(i!=j&&j!=k&&i!=k) {
					
					 boolean  flag = false;
					
					  for(int p=0;p<n;p++) {
						  //information[p]와 ijk가 조건을 만족하는가?
						  int first = information[p][0]/100;
						  int second =(information[p][0]/10)%10;
						  int third = information[p][0]%10;
					
						  int strike =0, ball =0;
						  
						  // 스트라이크일 경우
						  
						  if(first==i)
							  strike++;
						  if(second==j)
							  strike++;
						  if(third==k)
							  strike++;
						  
						  //볼일 경우
						  
						  if(i==second||i==third) ball++;
						  if(j==first||j==third)ball++;
						  if(k==first||k==second)ball++;
						  
						  // 주어진 예제와 같은지 판별 
						  
						  if(information[p][1]==strike&&information[p][2]==ball) {
							  result++;
						  }
						  
//						  if(information[p][1]!=strike||information[p][2]!=ball) {
//							  flag=true;
//						  }
//						  
//						  if(flag==false) {
//							  System.out.print(i);
//							  System.out.print(j);System.out.print(k);
//							  System.out.println();
//							  result++;
//						  }
//					  
					  
					  }
						
					}
				}
			}
			
			System.out.print(result);
			System.exit(0);
			
		}
		
		
			
	}
	
}


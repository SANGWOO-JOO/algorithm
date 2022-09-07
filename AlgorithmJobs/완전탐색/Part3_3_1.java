package 완전탐색;

import java.util.Scanner;

public class Part3_3_1 {
	
	//런타임 오류가 나는데 어디 부분이 잘못된걸까??? 
	
	// 답이 맞지도 않는거 같다.. 설계는 비슷하게 한것같은데... 

	public static void main(String[] args) {
		int i,j;
		int arr[][]=new int[10][10];
		Scanner sc = new Scanner(System.in);
//		i= sc.nextInt();
//		j= sc.nextInt();
		// 이중 반복문을 통해 주어지는 원소를 입력받는다
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
			 arr[i][j] = sc.nextInt();
			}
		}
		
		// 가장 자리에 특정 값을 넣는다.
		
		for(i=0;i<=6;i++) {
			arr[0][i]=10;
			arr[6][i]=10;
			arr[i][0]=10;
			arr[i][6]=10;
		}
		
		

		//상하좌우의 값과 비교해서 값을 출력한다.
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(arr[i-1][j]>arr[i][j]&&
				   arr[i+1][j]>arr[i][j]&&
				   arr[i][j-1]>arr[i][j]&&
				   arr[i][j+1]>arr[i][j])
					System.out.print("*");
				else
					System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		
		
	}

}

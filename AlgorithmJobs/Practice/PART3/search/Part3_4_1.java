package Practice.PART3.search;

import java.util.Scanner;

public class Part3_4_1 {

	public static void main(String[] args) {
		// 입력 값

		int n=0; // 색종이  수
		int a,b; //좌표
		int w; //넓이
		int h; //높이
		
		int [][]arr=new int [101][101];
		
		int []count=new int [101];
		int see=1; // 보이는 부분 각각 변수를 구하기 위한 필드값
		Scanner sc = new Scanner(System.in);
		
		//색종이 수 입력 받기
		n= sc.nextInt();
		//조건값 입력 받기 !! 
		for(int i=0;i<n;i++) {
			a= sc.nextInt();
			b= sc.nextInt();
			w= sc.nextInt();
			h= sc.nextInt();
			
		//입력 받은 값들로 평면에 색종이의 좌표를 매겨 대입.. 
			for(int j=b;j<b+h;j++) {
				for(int k=a;k<a+w;k++) {
				// i 넣어도 됨. 
			    // arr[j][k] 넣는 부분에 j k를 넣는것..  직관적으로 이해가 안된다. => 이해함. scanf 돌면서 계속 대입.
				// 
					arr[j][k]=i+1;
				
			}
		}
			
	}
		
		//겹치는 부분을 제외하고 보이는 부분의 면적의 갯수를 구한다
		for(int i=0;i<=100;i++) {
			for(int j=0;j<=100;j++) {
				count[arr[i][j]]++;
				
			}
		}
		
		//출력 
		for(int i=1;i<=n;i++) {
		 System.out.print(count[i]);
		 System.out.println();
		}
		
		
		
}

}

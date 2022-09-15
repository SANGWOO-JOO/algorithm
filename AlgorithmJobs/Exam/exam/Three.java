package Exam.exam;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n; //  몇명인지?? 
		int arr[][] =new int [1005][5];

		int max=-1; // 최대값
		int number=1;// 학생 번호
		int resultnumber=0;
		/*
		 * 학생수 입력	
		 */
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();
 
		for(int i=1;i<=n;i++) { // 번호 수
			 for(int j=0;j<5;j++) { // 1~5학년
				 arr[i][j]=sc.nextInt(); // 반 입력
			 }
		 }
		
		for(int i=1 ;i<=n;i++) {
			for(int j=1 ;j<=n;j++) {
				
				if(i == j) continue;
				
				if(arr[i][0]==arr[j][0]||
				   arr[i][1]==arr[j][1]||  
				   arr[i][2]==arr[j][2]||
				   arr[i][3]==arr[j][3]||
				   arr[i][4]==arr[j][4]) {
					number++;
				}
					
				
			}
			/*
			 * int max=-1; // 최대값
			  int number=0;// 학생 번호호
			 */
			
			if(max<number) {
				 max=number;
				 resultnumber=i;

			 }
			 number = 0;
		}
		System.out.print(resultnumber);

	}

}

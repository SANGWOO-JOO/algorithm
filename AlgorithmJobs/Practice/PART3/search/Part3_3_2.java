	package Practice.PART3.search;

import java.util.Scanner;

public class Part3_3_2 {
	

	public static void main(String[] args) {
     	
		 int n;
		 //[y][x] => 기억하자.. 아니 암기하자... 
		 int arr[][]=new int[1005][5];
		 
		 int result=-1; //최대값 
		 int resultNumber=1; // 학생 번호
		 int numStudent = 0;
		 
		 
		 Scanner sc =new Scanner(System.in);
		 //학생수 입력
		 n = sc.nextInt();
		 
		 // 이차원 배열로 입력 받기
		 for(int i=1;i<=n;i++) { // 번호 수
			 for(int j=1;j<=5;j++) { // 1~5학년
				 arr[i][j]=sc.nextInt(); // 반 입력
			 }
		 }
		 
		 //i번 학생에 대해서 겹치는 학생의 숫자를 구한다.
		 for(int i=1;i<=n;i++) {
			 //i와 j가 같은 반이었는지를 판별한다.
			 for(int j=1;j<=n;j++) {
				 
				 //이중 for문 밖에 넣어도 무방하지 않나??? 안에 넣어야 될까??? 안에 넣으면 틀린 답이 나온다. 
	//			 numStudent = 0;
				 if(i==j)continue;
				 // 한번이라도 같은 반이었던 ... 그래서 or로 써도 무방하다... 
				 if(arr[i][0]==arr[j][0]||
				 	arr[i][1]==arr[j][1]||
				 	arr[i][2]==arr[j][2]||	
					arr[i][3]==arr[j][3]||
					arr[i][4]==arr[j][4])
					numStudent++;
			 }
			 // i번째 돌고 나오면 비교
			 if(result<numStudent) {
				 result = numStudent;
				 resultNumber=i;
				 //카운트 초기화
				 //이중 for문 밖에 넣어도 무방하지 않나??? 안에 넣어야 될까??? 
//				 numStudent = 0;
			 }
			 numStudent = 0;
		 }
		 
		 System.out.print(resultNumber);
		 
		
	}
}

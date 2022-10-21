package Practice.PART3.search;

import java.util.Scanner;

public class Part4_1_2_feedback {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int information[][] = new int[105][3];
		/*
		 * result 조건을 만족하는 갯수
		 */
		int result=0;
		int res = 0;
		int n;


		//몇개의 줄이 들어가는가?
		n = sc.nextInt();

		// 입력
		for(int i=0;i<n;i++) {
			information[i][0] = sc.nextInt(); // 숫자
			information[i][1] = sc.nextInt(); // strike
			information[i][2] = sc.nextInt(); // ball
		}


		/* i 100의 자리
		 * j 10의 자리
		 * k 1의 자리
		 * 1~9까지 반복문으로 판별
		 */


		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				for(int k=1;k<=9;k++) {
					/*
					 * 서로 다른 세자리 수로 이루어 져야 한다 .
					 */
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

						  if(i==second||i==third)ball++;
						  if(j==first||j==third)ball++;
						  if(k==first||k==second)ball++;



						  if(information[p][1]!=strike||information[p][2]!=ball) {
							 flag=true;
						  }
						  if(flag==false) {
							  result++;

						  }
						  
					      }

						if(result==n) 
							res++;
						result = 0;

			}
		}
	  }
	}
		// 삼중 for문 이후 결과값 출력>
		System.out.print(res);
	}
}

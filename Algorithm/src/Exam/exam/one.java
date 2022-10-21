package Exam.exam;

import java.util.Scanner;

/*
 * 자연수n이 주어질 때, n 이 소수인지 판별하는 프로그램을 작성하여라. 여기서 소수란, 약수가 1과 자기자신밖에 존재하지 않는 수를 말한다.
 */


public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n =sc.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			System.out.print("YES");
		}
		
		else {
			System.out.print("NO");
		}

	}

}

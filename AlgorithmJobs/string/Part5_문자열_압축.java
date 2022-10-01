package string;

import java.util.Scanner;

public class Part5_문자열_압축 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String sample ;
		
		sample =sc.nextLine();
		char []a= sample.toCharArray();
		int cnt=0;
		char temp= a[0];
		String z="";
			
		for(int i=0;i<a.length;i++) {
			if(a[i]==temp)cnt++; // 앞과 뒤의 글자가 같을때 카운트 ++
			else {
				z += cnt+""+temp;
				temp=a[i]; //배열의 다음 글자로 이동
				cnt=1;
				}
			}
		if(cnt!=1)
		z += cnt+""+temp;
		else z+=""+temp;
		

		System.out.println(z);
	}
}
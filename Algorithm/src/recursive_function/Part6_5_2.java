package recursive_function;

import java.util.Scanner;

public class Part6_5_2 {

	static int n;
	static int [] result = new int [100];
	static int cnt;
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		
		getResult(0,0);
		System.out.print(cnt);
	}

	
	public static void getResult(int mySum, int index) {
		
		if(mySum == n) {
			 
			 System.out.print(result[0]);
			 for(int i = 1;i<index;i++) {
				 System.out.print("+"+result[i]);
			 }
			 System.out.println();	
			 cnt++;
		 }
		
		 else {
			 int myNumber ;
			 
			 if(index==0)myNumber=n-1;
			 
			 else myNumber=n-mySum; 
			 /*
			  * if ( ..) 출력 후 다시 for문 
			  */
			 
			 for(int i=myNumber;i>=1;i--) {
				 result[index] =i;
			
				 /*
				  * 큰 수에서 작은수로 내려가는 것
				  */
				 
				 if(index >0 && result[index-1]<result[index])continue;
				 
				 getResult(mySum+i, index+1);
				 
			 }	
		 }
	}

}

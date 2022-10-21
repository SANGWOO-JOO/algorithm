package recursive_function;
/*
 * tobin
 * 입력
 * 두 정수 n, k를 입력받아 k개의 1을 가진 n자리 이진 패턴을 출력하는 프로그램을 작성하세요.
 * 출력
 * 결과를 내림차순으로 출력한다.
 */


import java.util.Scanner;

public class Part6_6_1 {
	
	static int n, k;
	static int []arr =new int[30];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 자리 수 
		k = sc.nextInt(); // 1이 출력되는 개수
		Tobin(0,0);
			
		}

	private static void Tobin(int len, int num) {
		if(len>=n){
		    if(num == k){
		      for(int i=0; i<n; i++){
		    	System.out.print(arr[i]);
		      }System.out.println();
		    }
		    else
		      return;
		  }
		    else{//len<n
		    if(num <= k){
		    	arr[len]=1;
		    	Tobin(len+1, num+1);
		    	arr[len]=0;
		    	Tobin(len+1, num);
		    }	 
		  }
				
	}
}

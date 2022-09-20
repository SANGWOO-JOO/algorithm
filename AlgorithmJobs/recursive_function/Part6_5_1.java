package recursive_function;

import java.util.Scanner;

public class Part6_5_1 {
	static int n;
	static int r; 
	static Scanner sc = new Scanner(System.in );
	static int []result =  new int [20];
	 

	static void getResult(int x) {
		boolean flag =false;
		if(x>=r) {		
			for(int i=0;i<r;i++) {
				for(int j=0;j<r;j++) {
					if(i!=j && result[i]==result[j]) {
						flag =true;
					}
				}
			}
			
			if(flag==false) {
				for(int i = 0;i<r;i++) {
					System.out.print((char)(result[i]+(int)('a')));
				}
				System.out.println();
			}
		}
		else {
			for(int i=0;i<n;i++) {
				result[x]=i;
				getResult(x+1);
			}
		}
	}
	
	public static void main(String[] args) {
		

		n = sc.nextInt(); // 갯수
		r = sc.nextInt(); // 
		
		getResult(0);
	
	}

}

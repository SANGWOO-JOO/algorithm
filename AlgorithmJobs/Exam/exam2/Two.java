package Exam.exam2;

import java.util.Scanner;

public class Two {

	static int n;
	static int r; 
	static Scanner sc = new Scanner(System.in );
	static int []res=  new int [20];
	
	public static void main(String[] args) {
		 n = sc.nextInt();
	     r =sc.nextInt();
	     get(0);

	}

	static void get(int x) {
		boolean flag =false;
		if(x>=r) {		
			for(int i=0;i<r;i++) { // i
				for(int j=0;j<r;j++) { // j 
					if(i!=j && res[i]==res[j]) {
						flag =true;
					}
				}
			}
			
			if(flag==false) {
				for(int i = 0;i<r;i++) {
					System.out.print((char)(res[i]+(int)('a')));
				}
				System.out.println();
			}
		}
		else {
			for(int i=0;i<n;i++) {
				res[x]=i;
				get(x+1);
			}
		}
	}

}

package Part11_자료구조_트리;

import java.util.Scanner;

public class bi_공통_조상_찾기 {

	static boolean []color = new boolean [1005]; // color[x]가 true라면 x가 색칠되어 있음
	static int []parent = new int [1005];
	static int n;
	static int x,y;
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	for(int i=0;i<n-1;i++) {
		int a,b ;
		
		a =sc.nextInt();
		b =sc.nextInt();
		//b의 위에 a가 있다.
		parent[b] =a ;
		
	}
	
	while(true) {
		color[x] =true;	 
		
		
		if(x==0) {
			break;
		}
		
		x = parent[x];
	}
	
	while(true) {
		if(color[y]==true) {
		System.out.println(y);
		return ;
		
		}
		
		color[y]=true;
		y=parent[y];
	}
		
	

	}

}

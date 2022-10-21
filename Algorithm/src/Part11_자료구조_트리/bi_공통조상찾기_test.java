package Part11_자료구조_트리;

import java.util.*;
public class bi_공통조상찾기_test {

	static int n;
	static int x,y;
	static int a,b ;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		n = sc.nextInt();
		x =sc.nextInt();
		y =sc.nextInt();
			
		int []parent = new int [n];
		boolean []visit = new boolean [n];
		
		for(int i=0;i<n-1;i++) {
			
			
			a =sc.nextInt();
			b =sc.nextInt();
		
			parent[b] =a ; 	
			
		}
		
		while(true) {
			visit[x]=true;
			if(x==0)break;
			x=parent[x];
		}
		
		while(true) {
			if(visit[y]) {
				System.out.print(y);
				break;
			}
			else {
				visit[y]=true;
				y = parent[y];
			}
		}
		
	}

}

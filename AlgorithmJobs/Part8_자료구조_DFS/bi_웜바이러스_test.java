package Part8_자료구조_DFS;

import java.util.Scanner;

public class bi_웜바이러스_test {
	
	static int cnt=0;
	
	private static void dfs(int[][] a, boolean[] check, int visit) {
		
		if(check[visit]==true)return;
		
		check[visit] =true;
		cnt++;
		
		for(int i=0 ;i<a[visit].length;i++) {
			if(a[visit][i]==1&&!check[i]) {
				dfs(a, check, i);
			}
		}
		
	}
	
	public static void main(String[] args)  {
		
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt(); // node
		int e = sc.nextInt(); // edge
		
		int a[][] = new int[n+1][n+1]; 
		boolean check[] = new boolean[n+1]; // 확인
		
		for(int i =0; i<e ;i++) {
			
			int n1 =sc.nextInt();
			int n2 =sc.nextInt();
			
			a[n1][n2] =1;
			a[n2][n1] =1; //초기화
		}
		
		dfs(a, check, 1);
	}



	
}

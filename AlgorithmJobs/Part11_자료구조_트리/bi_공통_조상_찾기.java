package Part11_자료구조_트리;

import java.util.Scanner;

public class bi_공통_조상_찾기 {

	
	static int n;
	static int x,y;
	static int a,b ;
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
		
	n = sc.nextInt();
	x =sc.nextInt();
	y =sc.nextInt();
		
	int []parent = new int [n];
	boolean []isvisited = new boolean [n]; // color[x]가 true라면 x가 색칠되어 있음
	
	for(int i=0;i<n-1;i++) {
		
		
		a =sc.nextInt();
		b =sc.nextInt();
	
		parent[b] =a ; 	//b의 위에 a가 있다.
		
	}
	
	// x의 조상
	 while(true) {
         isvisited[x] = true;
         if(x == 0) break;
         x = parent[x];
     }
	
	 // y의 조상
	 while(true) {
         if(isvisited[y]) { // 가장 가까운 공통된 조상 (제일 처음 만난 공통 조상)
            System.out.print(y);
             break;
         } else {
        	 isvisited[y] = true;
             y = parent[y];
         }
     }	
	
	}
}

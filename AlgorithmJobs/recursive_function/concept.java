package recursive_function;

import java.util.Scanner;

//N개의 알파벳 중에서 R개를 나열할 수 있는 경우를 모두 출력하시오.

public class concept {

	static int MAX=105; 
	static int r , n;
	static char result[] =new char [MAX];
	static Boolean check[]=new Boolean[MAX];
	
	
	private static void getResult(int x) {
		// x번째 for문을 돌려야 함 
		if(x>=r) {
			System.out.print(result);
		}
		else {
			for(int i=0;i<n;i++) {
				char alpha = (char) (i+'a');
				if(check[i]==false) {
					result[x]=alpha;
					
					check[i]=true;				
					getResult(x+1);
					//x번째에 i를 놓는 모든 경우를 이미 다 고려했음
					check[i]=false;
					result[x]=0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		n = sc.nextInt();
		r = sc.nextInt();
		
		// 0번째 for문으로 부터 돌린다.
		getResult(0);
		
	}
	

}

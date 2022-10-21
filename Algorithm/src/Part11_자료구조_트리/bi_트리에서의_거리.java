package Part11_자료구조_트리;

import java.util.Arrays;
import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class bi_트리에서의_거리 {

	
	static int n;
	static int x,y;
	static int a,b;
	
	static int []parent;
	static int []isvistedx;
	static int []isvistedy;
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		x =sc.nextInt();
		y= sc.nextInt();
		
		parent = new int [n];
		isvistedx= new int [n];
		isvistedy= new int [n];
		
		Arrays.fill(isvistedx, -1); //Arrays.fill(배열 변수, 배열 데이터)를 사용하여 값을 일괄 초기화
        Arrays.fill(isvistedy, -1);
		for(int i=0; i<n-1;i++) {
			a = sc.nextInt();
			b =sc.nextInt();
			
			parent[b] =a ;
		}
		
		int count =0;
		while(true) {
			isvistedx[x] = count++;
            if(x == 0) break;
            x = parent[x];
		}
		
		 count = 0;
		    int sum = 0;
		    while(true) {
		        if(isvistedx[y] != -1) {
		            sum = isvistedx[y] + count;
		            break;
		        } else {
		        	isvistedy[y] = count++;
		            if(y == 0) break;
		            y = parent[y];
		        }
		    }

		    System.out.print(sum);
	}

}

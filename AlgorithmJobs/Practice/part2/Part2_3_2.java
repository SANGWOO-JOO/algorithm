package Practice.part2;

import java.util.Scanner;

public class Part2_3_2 {

	public static void main(String[] args) {
		/*
		 * 입력값 받는다
		 */
		      Scanner sc = new Scanner(System.in);
		      int n;
		      n = sc.nextInt();
		      /*
		       * 2중 for문으로
		       *  (1) 띄어쓰기 할때와 
		       *  (2) *를 찍는 것을 구한다.
		       *  
		       *  (1) for 문이 실행되고 (2)에 해당하는 for문이 실행된다.
		       */
		      for(int i=0;i<n;i++ ){
		        
		          for(int j=1;j<n-i;j++){
		            System.out.print(" ");
		          }
		          
		          //for(int j=0;j<2*i+1;j++) 이 부분 생각하는게 어려웠다.
		          for(int j=0;j<2*i+1;j++){
		            System.out.print("*");
		          }
		          System.out.println();
		          }

	}

}

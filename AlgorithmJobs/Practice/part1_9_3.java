package Practice;

import java.util.Scanner;

public class part1_9_3 {

	public static void main(String[] args) {
	      int a,b,c;
	      
	      Scanner sc = new Scanner(System.in);
	      
	      a = sc.nextInt();
	      b = sc.nextInt();
	      c = sc.nextInt();
	      
	      if((a>b)&&(a>c)){
	        System.out.print(a);
	      }
	      else if(b>c){
	        System.out.print(a);
	      }
	      else{
	        System.out.print(c);
	      }

	}

}

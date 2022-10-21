package Practice;

import java.util.Scanner;

public class part1_8_2 {

	public static void main(String[] args) {
	      int Number;
	      int i;
	      int q=1;
	      String a ="YES";
	      Scanner sc = new Scanner(System.in);
	      Number = sc.nextInt();
	      
	      for(i=2;i<=Number-1;i++){
	        if(Number%i==0){
	          a="NO";
	          break;
	        }
	      }
	      System.out.print(a);
	}

}

package Practice;

import java.util.Scanner;

public class part1_8_1 {

	public static void main(String[] args) {
	    int Number;
	      int sum =0;
	      int i=0;
	          Scanner sc = new Scanner(System.in);  
	          Number = sc.nextInt();
	          for(i=0; i<=Number;i++){
	            if(i%2==0){
	              sum=sum + i;
	            }
	          }
			System.out.println(sum);
	    

	}

}

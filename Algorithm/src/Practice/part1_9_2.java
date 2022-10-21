package Practice;

import java.util.Scanner;

public class part1_9_2 {

	public static void main(String[] args) {
	       int cnt =0;
	       int n,m;
	       
	       Scanner sc = new Scanner(System.in);
	       
	       n = sc.nextInt();
	       m = sc.nextInt();
	       
	       for(int i=n;i<=m;i++){
	          System.out.print(i +" ");
	          cnt++;
	         
	         if(cnt==8){
	           System.out.println("");
	         }
	       }
	}

}

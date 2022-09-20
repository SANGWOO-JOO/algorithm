package Practice;

import java.util.Scanner;

public class part1_8_3 {

	public static void main(String[] args) {
	    int cnt=0;
	    int flag=0;
	    
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    
	    for(int i=1;i<a;i++){
	      if(a%i==0){
	        cnt++;
	        flag =1;
	        if(cnt==b){
	          System.out.print(i);
	        }
	      }
	    }
	    if(flag==0){
	      System.out.print("0");
	    }

	}

}

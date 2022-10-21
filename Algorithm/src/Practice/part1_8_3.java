package Practice;

import java.util.Scanner;

public class part1_8_3 {

	public static void main(String[] args) {
	    int cnt=0;
	    int flag=0;
	    
	    Scanner sc = new Scanner(System.in);
	    int p = sc.nextInt();
	    int q = sc.nextInt();
	    
	    for(int i=1;i<p;i++){
	      if(p%i==0){
	        cnt++;
	        
	        if(cnt==q){
	          System.out.print(i);
	          flag =1;
	        }
	      }
	    }
	    if(flag==0){
	      System.out.print("0");
	    }

	}

}

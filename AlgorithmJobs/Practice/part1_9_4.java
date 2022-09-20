package Practice;

import java.util.Scanner;

public class part1_9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    a = sc.nextInt();
	    
	    for(int i = 1 ; i<=a ; i++){
	      if(i*i>=a){
	        System.out.print(i);
	        break;
	      }
	    }
	}

}

package Practice.part2;

import java.util.Scanner;

public class part2_4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a ,b,c,count;
	    
	    int what=0;
	    int max =0;
	    int compare=0;
	    
	    count =sc.nextInt();
	    
	    for(int i=0 ;i<count;i++){
	     a = sc.nextInt();
	     b = sc.nextInt();
	     c = sc.nextInt();
	      for(int j=0;j<count;j++){
	         
	    if(a==b&&a==c){
	     what = 10000+a*1000;
	    }
	    else if(a==b&&a!=c) {
	     what =1000+a*100;
	    }
	    else if(a==c&&b!=c){
	      what =1000+a*100;
	    }
	    else if(b==c&&a!=c){
	      what =1000+b*100;
	       
	    }
	    else if(a!=b&&a!=c&&b!=c){
	      max = a;
	      if(max<b){
	       max = b;
	      }
	      if(max<c){
	        max=c;
	      }
	      what = max*100;
	    }
	    
	    
	     if(compare<what){
	       compare = what;
	     }
	     
	    }
	      
	    
	}
	    System.out.print(compare);
	}
}


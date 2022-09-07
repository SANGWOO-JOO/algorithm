package Practice.part2;

import java.util.Scanner;

public class part2_4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		int n;
		int current=1;
		int previous=1;
		n= sc.nextInt();
		
		
		
		int arr[][]=new int[100][300];
		
		
		for(int i=0; i<n; i++){
			// 행 단위로 넘어갈 떄 구하는 공식
    		current=previous;
    		System.out.print(current);
    		System.out.print(" ");
    		
    		if(current==1)
    		previous = current+2;
    		else
    			previous++;
			
			
		    for(int j=1; j<=n; j++) {
		    	
		    	
		    		
		    		int add1=j;
			    	current+=add1;
			    	System.out.print(current);
			    	System.out.print(" ");
			    	add1++;
			    	
		    	
		    	
		    }
		    //한줄 띄기
		    System.out.println();
		    
	
		  }
		
	}
}

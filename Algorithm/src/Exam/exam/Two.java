package Exam.exam;

import java.util.Scanner;

public class Two {
	
	public static void main(String[] args){
	int n;
    Scanner sc = new Scanner(System.in);
   
    
    n = sc.nextInt();
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

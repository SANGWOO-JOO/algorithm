package Practice;

import java.util.Scanner;

public class part1_9_1 {

	public static void main(String[] args) {
	       int a ,b,c;
	       int cnt=0;
	       Scanner sc = new Scanner(System.in);
	       a = sc.nextInt();
	       b = sc.nextInt();
	       c = sc.nextInt();
	       
	       if(a>b){
	         int temp = a;
	         a=b;
	         b=temp;
	       }
	       
	       for(int i=a ; i<=b ; i++){
	         if(i%c==0){
	           cnt++;
	         }
	       }
	       if(cnt>=1){
	         System.out.print(cnt);
	       }
	       else{
	          System.out.print("0");
	       }
	}

}

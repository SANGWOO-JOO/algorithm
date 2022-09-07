package Practice.part2;

import java.util.Scanner;

public class part2_5_1 {

	public static void main(String[] args) {

	int n , s;
	Scanner sc =new Scanner(System.in);
	n = sc.nextInt();
	
	int sum=0;
	int score=0;
	
	for(int i=0;i<n;i++) {
		s=sc.nextInt();
		
		if(s==1) {
			score++;
			sum+=score;

		}else {
			score=0;
		}
		
	}
	
	System.out.print(sum);
		
	}

}

package Recursive_definition;

import java.util.Scanner;

public class tower_of_Hanoi {
	
	static void move(int no, int x, int y) {
		if(no>1){
			move(no-1,x,6-x-y);
		}
			System.out.printf("원반 %d를 %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);
			
			if(no>1) {
				move(no-1,6-x-y,y);
			}
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hanoi Tower");
		System.out.print("number");
		int n = sc.nextInt();
		
		move(n,1,3);
		
	}

}

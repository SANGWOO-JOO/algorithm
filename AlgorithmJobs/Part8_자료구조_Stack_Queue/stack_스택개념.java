package Part8_자료구조_Stack_Queue;

import java.util.Scanner;

public class stack_스택개념 {
	private int [] arr ;
	private int capacity =0;
	private int len;
	static int n; //크기가 n인 스택
	static int m; // m개의 연산
	
	static int a,b,c;
	public stack_스택개념(int stackSize) {
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		m =sc.nextInt();
		
		for(int i=0;i<m;i++) {
			a =sc.nextInt();
			
			if(a==1) {
				b =sc.nextInt();
				push(b);
			}
			else if(a==2) {
				pop(a);
			}
			else if(a==3) {
				top();
			}
			
		  
		}
		
	}
	
private void push(int p) {
	if(capacity<=arr.length) { // 저장공간보다 len이 더 크다면?? 
		System.out.println("overflow");
	}
	else {
		arr[len++]=p;	
	}	
}

private void pop(int y) {
	if(arr.length<=0) {
		System.out.println("underflow");
	}
	else {
		arr[len-1]=0;
		len--;
	}
}
private int top() {
	if(arr.length<=0){
		return -1;
	}
	else {
		return arr[len-1];
	}
}

}


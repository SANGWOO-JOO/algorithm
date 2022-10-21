package Part8_자료구조_Stack_Queue;

import java.util.Scanner;

public class stack_스택개념 {
	static int [] arr =new int [100];
	
	private static int top=-1;
	static int n; //크기가 n인 스택
	static int m; // m개의 연산
	
	static int a,b;
	public static void main(String[] args) {
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
				pop();
			}
			else{
				top();
			}			  
		}
		
	}

	
private static void push(int p) {
	if(n ==top+1) { // 저장공간보다 len이 더 크다면?? 
		System.out.println("overflow");
		
	}
	else {
		arr[++top]=p;	
	}	
}

private static void pop() {
	if(top<0) {
		System.out.println("underflow");
	}
	else {
		top--;
	}
}
private static void top() {
	if(top<0){
		System.out.println("NULL");
	}
	else {
		System.out.println(arr[top]);
	}
}

}


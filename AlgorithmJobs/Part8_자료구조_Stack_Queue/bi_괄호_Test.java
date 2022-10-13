package Part8_자료구조_Stack_Queue;

import java.io.*;
import java.util.*;

public class bi_괄호_Test {
	/*
	 *  50이하 배열로 저장 
	 *  top로 찍는 구조
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int stack[] = new int[50];
		int top =0;
		
		char[] par = br.readLine().toCharArray();
		int len = par.length;
		
		for(int i =0 ;i <len ;i++) {
			if(par[i]=='(') {
				stack[top] =i;
				top ++;
			}
			// ) 들어온다 생각할 때 
			else {
				if(top==0) {
				System.out.println("NO");
				return;
			}
			stack[top-1]=0;
			top--;
		}
		}
		
		//result
		if(top>0) {
			System.out.print("NO");
		}
		else {
			System.out.print("YES");
		}
		
	}
}

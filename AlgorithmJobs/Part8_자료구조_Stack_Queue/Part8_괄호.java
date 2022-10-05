package Part8_자료구조_Stack_Queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class Part8_괄호 {

//	private static char[] data;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int myStack [] = new int [55];
		int myTop = 0;
		
		char paren[] = br.readLine().toCharArray();
		int len = paren.length;
		
		for(int i =0 ; i<len;i++) {
			if(paren[i] == '(') {
				myStack[myTop]=i;
				myTop++;
			}
			else{
				if(myTop==0) {
					System.out.print("No");
					return;
				}
				myStack[myTop-1]=0;
				myTop--;
			}
		}
		
		if(myTop>0) {
			System.out.print("No");
		}
		else {
			System.out.print("Yes");
		}
	}

}

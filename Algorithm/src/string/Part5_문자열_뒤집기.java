package string;

import java.util.Scanner;

public class Part5_문자열_뒤집기 {

	public static void main(String[] args) {

		String string ;
		Scanner sc =new Scanner(System.in);
		
		string =sc .nextLine();
		
		String reverse ="";
		for(int i=string.length()-1;i>=0;i--) {
			reverse = reverse +string.charAt(i);
		}

		System.out.print(reverse);
	}

}

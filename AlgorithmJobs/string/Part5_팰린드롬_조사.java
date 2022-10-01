package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part5_팰린드롬_조사 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		String[] getStr = br.readLine().split(""); //문자열로 받고 split메소드를 이용해서 공백을 기준으로 잘라서 활용.
	    boolean resFlag = isPalindrome(getStr);
	    if(resFlag==true) {
	      System.out.println("YES");
	    } else {
	      System.out.println("NO");
	    }
	}

	private static boolean isPalindrome(String[] str) {
		
		int originLength  = str.length;
	    int halfLengthVal = originLength / 2;
		
	    
	    for(int i=0;i<halfLengthVal;i++) {
	    	if(!str[i].equals( str[originLength-i-1] ))return false;
	    }
	    return true;
	}
}

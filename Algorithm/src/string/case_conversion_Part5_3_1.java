package string;

import java.util.*;

public class case_conversion_Part5_3_1 {
	public static void main(String[] args) {
		
		String input = "";	//입력받은 문자열을 저장할 input 선언
		String output = "";	//최종적으로 출력할 문자열을 저장하는 output 선언
		char tmp;
		
		Scanner scanner = new Scanner(System.in);
		
		input = scanner.nextLine();	//입력받은 문자열을 input에 저장
		
		for(int i = 0 ; i < input.length() ; i++) {	//문자열을 검사하기 위해서 input의 길이만큼 반복문 실행(한글자씩 tmp에 옮겨서 검사)
			
			tmp = input.charAt(i);	//문자열을 한글자씩 tmp에 넣는다.
			
			if( (65 <= tmp) && (tmp <= 90) ) {	//문자가 65 <= tmp <= 90인 경우 (대문자인 경우)
			
				output += input.valueOf(tmp).toLowerCase();	//내장함수를 이용해서 소문자로 변환
				//valueof (): valueOf() 메소드는 ()괄호 안의 해당 객체를 String 객체로 변환시키는 역활을 합니다.
			
			}else if( (97 <= tmp) && (tmp <= 122)) { //문자가 97 <= tmp <= 122인 경우 (소문자인 경우)
				
				output += input.valueOf(tmp).toUpperCase();	//내장함수를 이용해서 대문자로 변환
				
			}else {	//그 외의 문자열인 경우
				
				output += (char)tmp;	//그대로 넣는다.
						
			}
		}
		
		System.out.println(output);		// 최종적으로 변환한 글자열인 output을 출력
		
	}	

}

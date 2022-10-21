package Part2_java_lang_패키치;

import java.io.StringBufferInputStream;

public class StringBufferExam {

	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		
		// 스트링 버퍼에 "hello", 공백, "world"를 차례대로 추가
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		// StringBuffer에 추가된 값을 toString()메소드를 이용하여 반환
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		
		if(sb2==sb3) 
			//sysout 
			System.out.println("sb2==sb3");
		//메서드 체이닝
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);
	}
}

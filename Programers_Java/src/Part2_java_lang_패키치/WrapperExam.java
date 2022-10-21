package Part2_java_lang_패키치;

public class WrapperExam {
	
	public static void main(String[] args) {
		int i = 5;
		Integer i2  = new Integer(5);
		/*
		 * 자바 5 이후 i3 처럼 객체 생성하지 않고 사용가능!!
		 * 자동으로 감싸준다 => 오토 박싱 
		 */
		Integer i3 =5; 
		int i4 =i3.intValue();
		
		int i5 =i3 ;
		
		
		
	}

}

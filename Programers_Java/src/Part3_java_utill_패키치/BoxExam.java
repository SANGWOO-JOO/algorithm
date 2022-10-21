package Part3_java_utill_패키치;

public class BoxExam {
	
	public static void main(String[] args) {
//		Box box = new Box();
//		box.setobj(new Object()); // 1. Box에 값 넣기. 2. Object 객체 생성해서 넣기/
//		Object obj =box.getobj(); // 1. 값을 가져오고 싶다. 2. 그릇에 값 넣기 그릇 = obj 값 : box.getobj()
//		
//		box.setobj("hello");
//		String str =(String)box.getobj(); // String으로 형변환
//		System.out.println(str);
//
//		box.setobj(1);
//		int value =(int)box.getobj();
		
		Box<Object> box = new Box<>();
        box.setobj(new Object());
        Object obj = box.getobj();

        Box<String> box2 = new Box<>();
        box2.setobj("hello");
        String str = box2.getobj();
        System.out.println(str);

        Box<Integer> box3 = new Box<>();
        box3.setobj(1);
        int value = (int)box3.getobj();
        System.out.println(value);
		
	}

}

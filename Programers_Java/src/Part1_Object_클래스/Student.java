package Part1_Object_클래스;

public class Student {
	String name;
	String number;
	int birthYear;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="홍길동";
		s1.number="1234";
		s1.birthYear=1995;
		
		Student s2 = new Student();
		s2.name ="홍길동";
		s2.number="1234";
		s2.birthYear=1995;
		
		if(s1.equals(s2))
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		
		System.out.println("해시코드");		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("toString");	
		System.out.println(s2);
		System.out.println(s2.toString());
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}
	
}

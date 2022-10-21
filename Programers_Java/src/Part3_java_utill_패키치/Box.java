package Part3_java_utill_패키치;

public class Box<E> {
	private E obj; //Object -> E로 바꿈
	
	public void setobj(E obj) { //Object -> E로 바꿈
		this.obj = obj;
	}
	
	public E getobj() { //Object -> E로 바꿈
		return obj;
	}
}

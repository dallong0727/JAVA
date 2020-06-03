package generic.basic03;

public class Course<T> {

	private String num;
	private T student; // 구체적인 타입(type)을 적지 않고 변수 형태로 적어 놓는 것

	//get, set
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public T getStudent() {
		return student;
	}
	public void setStudent(T student) {
		this.student = student;
	}	
}

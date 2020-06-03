package poly.basic3;

public class Student extends Person {
	
	String studentId;
	
	//this 키워드를 이용해서 name, age, studentId를 초기화하는 생성자
	
	Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	String info() {
		return "이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentId;
	}
	
}

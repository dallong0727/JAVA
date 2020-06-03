package generic.basic03;

public class MainClass {
	
	public static void main(String[] args) {
		
		Course<Student> course = new Course<>();
		
		course.setNum("1");
		course.setStudent(new Student("홍길동", 20));
		
		////////////////////////////////////////////
		
		ITBank i = new ITBank();
		i.info(course);
		System.out.println(i.get().getStudent().getName());	
	}
}

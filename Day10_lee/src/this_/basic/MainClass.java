package this_.basic;

public class MainClass {

	public static void main(String[] args) {

		Person p1 = new Person("홍길자", 20);
		Person p2 = new Person("홍길동");
		Person p3 = new Person();
		
		Employee e = new Employee("홍길동", 40, "행정부");
		System.out.println(e.info());
	}

}

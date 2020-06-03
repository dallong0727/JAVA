package final_.field;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person("123123", "박");
		Person p2 = new Person("456456", "김");
		
//		p1.nation = "미국"; (x)
//		p1.ssn = "456456"; (x)
//		p1.name = "이"; (o)
		
		System.out.println("국가 : " + p1.nation + ", 주민번호 : " + p1.ssn + ", 이름 : " + p1.name);

	}

}

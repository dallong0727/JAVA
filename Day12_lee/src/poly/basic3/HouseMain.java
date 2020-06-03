package poly.basic3;

public class HouseMain {

	public static void main(String[] args) {
		
		Person s1 = new Person("홍길동", 20);	
		Person s2 = new Person("박찬호", 30);	
		Person s3 = new Person("손흥민", 20);	
		Person s4 = new Person("이승철", 50);
		Person s5 = new Person("김유신", 50);
		Person s6 = new Person("최강창민", 20);
				
		House h = new House();
		h.getIn(s1);
		h.getIn(s2);
		h.getIn(s3);
		h.getIn(s4);
		h.getIn(s5);
		h.getIn(s6);
		h.print();
		h.House();
	}
}

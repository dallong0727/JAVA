package abs.good;

public class MainClass {

	public static void main(String[] args) {
		
		//1. 추상 클래스(추상 메서드)를 사용하면 오버라이딩이 강제화 되기때문에 프로그래머의 오버라이딩 실수를 줄일 수 있습니다.
		//2. 다형성을 안전하게 사용할 수 있게 해주는 원리.
		
		//추상클래스는 객체로 생성할 수 없습니다.
//		HeadStore h = new HeadStore(); (x)
		
		HeadStore h1 = new SeoulStore();
		HeadStore h2 = new BusanStore();
		h1.info(h2);
		h1.info(h1);
		h1.apple();
		h1.banana();
		h2.melon();
		
		
//		System.out.println("상호명 : " + s.getName());
//		s.apple();
//		s.banana();
//		s.melon();	
//		s.orange();
//		s.mango();
//		
//		System.out.println("----------------------");
//		
//		BusanStore b = new BusanStore();
//		
//		System.out.println("상호명 : " + b.getName());
//		b.apple();
//		b.banana();
//		b.melon();
//		b.orange();
//		b.mango();
//		
		
	}
	
}

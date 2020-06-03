package poly.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Parents p = new Parents();
		p.method1();
		p.method2();		
		
		Child c = new Child();
		c.method1(); //상속받은 메서드
		c.method2(); //오버라이딩 메서
		c.method3(); //자식의 메서드
		
		System.out.println("---------다형성 적용----------");
		Parents p1 = c;
		
		System.out.println(c); //주소값
		System.out.println(p1); //주소값
		System.out.println(c == p1); //주소값
		
		p1.method1();
		p1.method2();
//		p1.method3();(x)
		
		/*
		 * 다형성 적용시에 자식이 가지고 있던 본래 멤버에 접근할 수 없는 문제가 발생합니다.
		 * 단, 재정의 도니 메서드는 정상적으로 호출 됩니다.
		 */
		
		System.out.println("---------클새스 캐스팅---------");
		
		Parents pp = new Child();
		Child cc = (Child) pp;
		
		/*
		 * 다형성이 일어나지 않은 객체를 대상으로 클래스캐스팅을 실행하면 에러가 발생합니다.
		 */
		//에러 발생
//		Parents ppp = new Parents();
//		Child ccc = (Child) ppp;
		
		
		
		
	}
}

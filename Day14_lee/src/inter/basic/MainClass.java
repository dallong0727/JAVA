package inter.basic;

public class MainClass {

	public static void main(String[] args) {
	
		Basic b = new Basic();
		b.method1();
		b.method2();
		b.method3();
		
		System.out.println(Inter1.PI);
		System.out.println(Inter2.ABC);
		
		/*
		 * 인터페이스도 하나의 데이터 타입이 될 수 있습니다.
		 * 인터페이스에 객체를 저장했을 때, 다형성의 형태와 동일하게 시행
		 */
		
		Inter1 i1 = b;
		i1.method1(); //오버라이딩 된 메서드
//		i1.method2(); //오버라이딩 된 메서드
//		i1.method3(); //오버라이딩 된 메서드
		Inter2 i2 = b;
//		i2.method1(); //오버라이딩 된 메서드
		i2.method2(); //오버라이딩 된 메서드
//		i2.method3(); //오버라이딩 된 메서드
		
		Basic bb = (Basic) i1;
		
	}
}

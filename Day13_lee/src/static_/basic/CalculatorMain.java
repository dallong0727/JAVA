package static_.basic;

public class CalculatorMain {

	public static void main(String[] args) {

		/*
		 * 1. 녹색, 빨강색 계산기를 각각 생성
		 * 2. 계산기 색상을 확인하세요
		 * 3. add(int a) 메서드를 추가 합니다.
		 * 4. 계산기 result 값도 각각 확인.
		 * 5. pi와 circle() 사용 해서 원의 넓이를 구하세요.
		 */
		
		Calculator c1 = new Calculator();
		c1.setColor("녹색");
		c1.getColor();
		
		Calculator c2 = new Calculator();
		c2.setColor("빨강");
		c2.getColor();
		
		c1.add(5);
				
		Calculator.circle(5);
		Calculator.rect(5);

	}
}

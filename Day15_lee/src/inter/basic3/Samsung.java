package inter.basic3;

public class Samsung implements Printed{
	
	public String name = "Samsung";
	
	public void turnOn() {
		
		System.out.println(name);
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println(name);
		System.out.println("전원을 끕니다.");
		
	}

	public void print(String document) {
		System.out.println(name);
		System.out.println(document);
	}

	public void colorPrint(String document, String color) {
		System.out.println(name);
		System.out.println(document);
		System.out.println(color+ "색출력: " + document);
	}

	public int copy(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println(i + "장 복사 완료");
		}
		return n;
	}
}

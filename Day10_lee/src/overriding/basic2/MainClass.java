package overriding.basic2;

public class MainClass {

	public static void main(String[] args) {

		Parents p = new Parents();
		p.method1();
		p.method2();
		
		System.out.println("---------------");
		
		Child c = new Child();
		c.method1();
		c.method2();
		c.method3();		
	}
}

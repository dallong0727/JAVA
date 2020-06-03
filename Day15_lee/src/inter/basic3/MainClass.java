package inter.basic3;

public class MainClass {

	public static void main(String[] args) {
	
		Printed p1 = new LG();
		Printed p2 = new Samsung();
		
		p1.turnOn();
		p1.colorPrint("가나다라", "검정");
		p1.print("마바사");
		p1.copy(10);
		p1.turnOff();
		
	}

}

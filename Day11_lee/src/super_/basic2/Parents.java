package super_.basic2;

public class Parents {
	
	String father;
	String mother;
	
	Parents(String father, String mother) {
		this.father = father;
		this.mother = mother;
	}
	
	void info() {
		System.out.println("아버지 : " + father + "어머니 : " + mother);
	}

}

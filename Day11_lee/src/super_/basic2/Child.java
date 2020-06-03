package super_.basic2;

public class Child extends Parents{

	String me;
	
	Child(String father, String mother, String me) {
		super(father, mother);
		this.me = me;	
	}
	
	void info() {
		super.info();
		this.me = me;
	}
}

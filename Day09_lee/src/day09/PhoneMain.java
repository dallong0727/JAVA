package day09;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone basic = new Phone();
		basic.info();
		
		Phone black = new Phone("블랙");
		black.info();
		
		Phone white = new Phone(400000, "하양");
		white.info();
		
		Phone red = new Phone("갤럭시", "빨강");
		red.info();
		
		//모든 멤버변수를 받는 생성자를 생성
		//그린, 100000, 샤오미 전달해서 객체를 생성
		
		Phone green = new Phone("샤오미", 100000, "그린");
		green.info();
		
	}

}

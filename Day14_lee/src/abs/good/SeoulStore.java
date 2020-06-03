package abs.good;

public class SeoulStore extends HeadStore {

	public void apple() {
		System.out.println("서울 지점 사과는 500원 입니다.");
	}

	public void banana() {
		System.out.println("서울 지점 바나나는 600원 입니다.");
	}

	public void orange() {
		System.out.println("서울 지점 오렌지는 800원 입니다.");	
	}

	public void melon() {
		System.out.println("서울 지점 멜론는 700원 입니다.");	
	}
	
	public void info(HeadStore h) {
		if(h instanceof SeoulStore) {
			SeoulStore s = (SeoulStore) h;
			System.out.println("서울지점입니다.");
		} else if(h instanceof BusanStore) {
			BusanStore b = (BusanStore) h;
			System.out.println("부산지점입니다.");
		}
	}

}

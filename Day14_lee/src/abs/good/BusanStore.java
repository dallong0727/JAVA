package abs.good;

public class BusanStore extends HeadStore {

	@Override
	public void apple() {
		System.out.println("부산 지점 사과 200원");
		
	}

	@Override
	public void banana() {
		System.out.println("부산 지점 바나나 200원");
		
	}

	@Override
	public void orange() {
		System.out.println("부산 지점 오렌지 200원");
	}

	@Override
	public void melon() {
		System.out.println("부산 지점 멜론 200원");
		
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

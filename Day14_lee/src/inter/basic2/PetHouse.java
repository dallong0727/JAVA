package inter.basic2;

public class PetHouse {

	/*
	 * 1. carePet() 메서드 선언
	 * 매개변수는 모든 팻타입을 받을 수 있도록 선언
	 * 기능 - instanceof를 사용해서 캐스팅을 해보고, "멍멍이를 돌봅니다." 출력문 처리
	 */
	
	
	public void carePet(IPet pet) {
		if(pet instanceof Dog) {
			Dog d = (Dog) pet;
			System.out.println("강아지를 돌봅니다.");
		} else if(pet instanceof Cat) {
			Cat c = (Cat) pet;
			System.out.println("고양이를 돌봅니다.");			
		} else if(pet instanceof GoldFish) {
			GoldFish g = (GoldFish) pet;
			System.out.println("금붕어를 돌봅니다.");
		}
	}
	
	/*
	 * 2. petInfo() 메서드 선언
	 * 매개변수는 IPet배열을 받을 수 있도록 선언
	 * 기능 - IPet배열을 회전해서 play()를 실행
	 */
	
	public void petInfo(IPet[] pet) {
		//for(int i = 0; i <pet.length; i++) {
		//	pets[i].play();
		//}	
		for(IPet pet2 : pet) {
			pet2.play();
		}
	}
	
}

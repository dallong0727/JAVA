package inter.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal hodol = new Tiger();
		
		IPet gold = new GoldFish();
	
		//1. Animal[] 생성 후 baduk, nabi, hodol를 저장한 후에 향상된 포문으로 Animal의 공통 기능을 출력
		System.out.println("-------------------------------");
		Animal[] arr = new Animal[3];
		arr[0] = baduk;
		arr[1] = nabi;
		arr[2] = hodol;
		
		//Animal[] arr = {baduk, nani, hodol};
		
		for(Animal arr2 : arr) {
			arr2.eat();
		}
		
		//2. IPetp[ 생성후 baduk, nabi, 금붕어를 저장하고 향상된 포문으로 출력
		//baduk이는 Animal타입이지만, 하위클래스가 상호 연관이 있다면, 형변환이 가능함.
		System.out.println("-------------------------------");
		IPet[] arr3 = new IPet[3];
		arr3[0] = (IPet) baduk;
		arr3[1] = (IPet) nabi;
		arr3[2] = gold;
		
		for(IPet arr4 : arr3) {
			arr4.play();
		}
		
		System.out.println("-------------------------------");
		PetHouse p = new PetHouse();
		p.carePet(gold);
		p.carePet(new Cat());
		p.petInfo(arr3);
	}	
}

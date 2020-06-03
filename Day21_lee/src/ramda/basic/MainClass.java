package ramda.basic;

public class MainClass {

	public static void main(String[] args) {
		Person p = new Person();
		p.greeting(new Say01() {
			public void talking() {
				System.out.println("안녕");	
			}
		});	

		Person pp = new Person();
		pp.greeting(new Say02() {

			public String talking() {
				System.out.println("Hello1");
				return "Hello2";
			}
		});

		Person ppp = new Person();
		ppp.greeting(new Say03() {

			public String talking(String greet) {
				System.out.println(greet);
				return greet;
			}
		});

		System.out.println("----------------------");
		p.greeting(() -> {
			System.out.println("안녕하세요");
		});

		p.greeting(() -> {
			System.out.println("Hello3");
			return "Hello4";
		});

		p.greeting((greet) -> { //String의 생략이 가능
			System.out.println(greet);
			return greet;
		});
		
		//greeting 메서드를 실행해서 결과로 HiHiHi반환 받는 람다표현식
		System.out.println("------------------");
		String result2 = p.greeting((String result,int i) -> {
			String result3 ="";
			for(int j = 0; j < i; j++) {
				result3 += result;
			}
			return result3;
		});
		System.out.println(result2);
	}
}

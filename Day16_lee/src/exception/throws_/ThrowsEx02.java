package exception.throws_;

public class ThrowsEx02 {

	public static void main(String[] args) {
	
		
		
	}
	public void aaa(int i) throws Exception{
		System.out.println("aaa 호출");
		
		System.out.println(10 / i);
		
		System.out.println("aaa 종료");
	}
	
	public void bbb() throws Exception{
		System.out.println("bbb 호출");
		
		aaa(0);
	
		System.out.println("bbb 종료");
	}
	
	public ThrowsEx02() throws Exception{
		System.out.println("생성자 호출");
		bbb();
		System.out.println("생성자 종료");
	}
}

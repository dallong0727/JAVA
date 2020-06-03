package day01;
/**
 * 
 * @author User
 *
 */
public class SystemOut {
	
	public static void main(String[] args) {
	
		System.out.println("안녕하세요");
		System.out.println("반가워요");
		
		System.out.print("줄바꿈이 없음\n");
		
	/*
	 * \n 줄바꿈
	 * \t tab정렬
	 * %d 정수를 입력받음
	 * %s 문자열 입력받음
	 * %f 실수값 입력받음
	 * 실수 서식문자에서 %.xf형식 소수점의 자리수를 표현한다.
	 * 
	 * 이름이 동시에 : alt + shift + r
	 */
		
		System.out.printf("안녕하세요 제이름은 %s이고 오늘날짜는 %d월 %d일입니다.\n", "홍길동", 03, 23);
		//%.2f는 소수점 둘째자리까지 표현
		System.out.printf("파이 값은 %.2f\n", 3.14);
		//\t는 Tap과 같은 기능
		System.out.printf("%dx%d=%d \t%dx%d=%d\n", 2, 1, 2, 2, 2, 4);
		
	}	

}

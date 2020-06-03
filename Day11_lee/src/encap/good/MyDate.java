package encap.good;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉된 변수에 접근할 때는 클래스 설계자가 미리 생성해 놓은
	 * getter/setter메서드를 사용해서 데이터에 접근합니다.
	 * 
	 * setter 메서드 선언
	 * 1. 은닉변수에 값을 저장하기 위한 메서드
	 * 2. 접근제한자 public으로 선언하고 이름은 set + 멤버변수이름으로 지정 
	 */
	
	public void setYear(int year) {
		
		if(year < 1 || year > 2020) {
			System.out.println("잘못된 값 입력입니다.");
		} else {
			this.year = year;
		}
	}
	
	public void setMonth(int month) {
		
		if(month < 1 || month > 12) {
			System.out.println("잘못된 값 입력입니다.");
		} else {
			this.month = month;
		}
	}
	
	public void setDay(int day) {
		
		if(day < 1 || day > 31) {
			System.out.println("잘못된 값 입력입니다.");
		} else {
			this.day = day;
		}
	}
	
	public void setSsn(String ssn) {
		
		if(ssn.length() != 13) {
			System.out.println("잘못된 값 입력입니다.");
		} else {
			this.ssn = ssn;
		}
	}
	/*
	 * getter 메서드 선언
	 * 1. 은닉변수에 값을 조회하는 메서드
	 * 2. 접근제한자는 public선언하고 이름은 get + 멤버변수이름으로 지정
	 */
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public String getSsn() {
		return ssn;
	}
}

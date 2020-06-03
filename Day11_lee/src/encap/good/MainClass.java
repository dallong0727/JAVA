package encap.good;

import java.sql.DriverManager;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
	
		MyDate me = new MyDate();
		me.setYear(2020);
		me.setMonth(13);
		me.setDay(32);
		me.setSsn("1234567891234");
		int year = me.getYear();
		System.out.println(year + "년");
		int m = me.getMonth();
		System.out.println(m + "월");
		int d = me.getDay();
		System.out.println(d + "일");
		String s = me.getSsn();
		System.out.println("주민번호는 "  + s + "입니다.");
		
		System.out.println("----------------------");
		
		Member m1 = new Member("hh123", "1234", "홍길동", "google", "서울", 010, 20);
		Member m2 = new Member("kk123", "12345", "홍길자", "naver", "경기", 010, 30);
		Member[] arr2 = new Member[2];
		arr2[0] = m1;
		arr2[1] = m2;
		System.out.println(Arrays.toString(arr2));
				
		for(int i = 0; i < arr2.length; i++) {
			Member m3 = arr2[i];
			
			System.out.println(m3.getId());
			System.out.println(m3.getPw());
		}
		
	
	}

}

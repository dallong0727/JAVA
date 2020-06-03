package api.util.date;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateEx {

	public static void main(String[] args) {
		
		//날짜 클래스
		Date d = new Date();
		System.out.println(d.toString());
		
		//날짜 포멧클래스
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String now = sdf.format(d);
		System.out.println(now);
		
	}	
}

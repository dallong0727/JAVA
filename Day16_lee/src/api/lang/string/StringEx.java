package api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		//charAt() 특정 인덱스의 문자열 반환
		String str = "안녕하세요~";
		char a = str.charAt(1);
		System.out.println(a);
		
		//indexof - 문자열을 찾아서 인덱스를 반환		
		int b = str.indexOf("요");
		System.out.println(b);
		
		//length
		System.out.println("문자열 길이 : " + str.length());
		
		//replace - 문자열 변경
		String str2 = "자바는 재밌습니다. 자바는 커피집 이름입니다.";
		String str3 = str2.replace("자바", "JAVA");
		String str4 = str2.replace(" ", "");
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		//substring - 문자열 자르기
		String str5 = "123123-4564564";
		String str6 = str5.substring(7); //매개값을 한개만 주면 앞문자열의 제거
		System.out.println(str6);
		String str7 = str5.substring(0, 6);
		System.out.println(str7);
		String str8 = str5.substring(7, str5.length()); //매개값을 2개 주면 문자열을 추출
		System.out.println(str8);
		
		//trim - 앞, 뒤 공백 제거
		String str9 = "      홍길동            ";
		str9 = str9.trim();
		System.out.println(str9);
		
		//valueOf - 기본형을 문자열로 변경
		System.out.println(String.valueOf(3) + String.valueOf(4));
		
		//spilt - 문자열 자르기
		String str10 = "010-1234-5678";
		String[] arr = str10.split("-");
		String[] arr2 = str10.split("");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		String[] arr3 = str10.split("", 5);
		System.out.println(Arrays.toString(arr3));
		
	}
}

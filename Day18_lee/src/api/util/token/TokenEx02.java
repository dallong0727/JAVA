package api.util.token;

import java.util.StringTokenizer;

public class TokenEx02 {

	public static void main(String[] args) {
		
		String log = "2020.04.16, 목요일, /bno= 30, user= 홍길동;";
		
		StringTokenizer token1 = new StringTokenizer(log, ",");	
		while(token1.hasMoreTokens()) { //검사할 다음 토큰이 있으면 true반환
			System.out.println(token1.nextToken());
		}
		
		System.out.println("----------------------------------");
		
		//, . / 기준으로 자름
		
		StringTokenizer token2 = new StringTokenizer(log, ",./");	
		while(token2.hasMoreTokens()) { //검사할 다음 토큰이 있으면 true반환
			System.out.println(token2.nextToken());
		}
		
		System.out.println("----------------------------------");
		
		StringTokenizer token3 = new StringTokenizer(log, ",", true); //기본형 공백에 ,구분자도 토큰에 포함시킴	
		while(token3.hasMoreTokens()) { //검사할 다음 토큰이 있으면 true반환
			System.out.println(token3.nextToken());
		}
		
	}
	
}

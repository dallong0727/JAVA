package api.util.random;

import java.util.Random;

public class RandomEx {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int i = r.nextInt();
		System.out.println(i); //int가 표현하는 범위까지 랜덤수
		
		int i1 = r.nextInt(10) + 1; // 1~10까지 랜덤수
		System.out.println(i1);
		
		double j = r.nextDouble();
		System.out.println(j); //0~1.0까지 실수 범위
		
		
	}
}

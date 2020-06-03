package day04;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {

		//정수를 받아서 해당 정수가 소수인지 판별.
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력> ");
		int num = scan.nextInt();
		int count = 0;
		
		for(int i = 2; i <= num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		System.out.println(count == 1 ? num + "은(는) 소수 입니다." : num + "은(는) 소수가 아닙니다.");
	}

}

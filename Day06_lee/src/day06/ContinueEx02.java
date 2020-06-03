package day06;

import java.util.Scanner;

public class ContinueEx02 {

	public static void main(String[] args) {
		//정수를 입력받아서 해당 숫자까지 모든 소수들의 합
		//ex)5를 받으면 10이 나오면 됩니다.

		Scanner sc = new Scanner(System.in);    
		System.out.print("숫자를 입력하세요 : ");
		int i = sc.nextInt();

		int sum = 0;
		start : for(int n = 1; n <= i; n++) {

			//소수 판별을 위한 for문
			int count = 0;
			for(int k = 1; k <= n; k++) {
				if (n % k == 0) {
					count++;
				}
				if(count > 2) {
					continue start;
				}
			}
			if(count == 2) {
				sum += n;
				System.out.println(sum);
			}
		}		
		sc.close();
	}
}
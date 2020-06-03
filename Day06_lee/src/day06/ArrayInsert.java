package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		//입력받는 순서대로 값을 저장
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[100];
		
		System.out.println("먹고싶은 음식을 선택하세요");
		System.out.println("입력을 중지하려면 [그만]을 입력하세요");
		int count = 0; //입력받은 개수를 카운트 해서 index로 사용하는 변수
		
		while(true) {
			
			System.out.print(">");
			String menu = scan.nextLine();
			
			if(menu.equals("그만")) {
				System.out.println("입력종료");
				break;
			
			}
			arr[count] = menu;
			count++;
			
		}
		
		//입력 종료 후, 출력조건
		for(int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}

}

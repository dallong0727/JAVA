package day05;

import java.util.Scanner;

public class BreakEx02 {

	public static void main(String[] args) {
		
		while(true) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("4 x 6 = ?");
			System.out.print("> ");
			int num = scan.nextInt();
			if(num == 24) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("오답입니다. 다시 입력해 주세요");
				
			}
			
			
		} 
		
		
	}

}

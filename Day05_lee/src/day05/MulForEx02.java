package day05;

public class MulForEx02 {

	public static void main(String[] args) {
		
		/*
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 */
		int star = 5;
		for(int i = 0; i < 5; i++) {//행을 나타내는 for문
			for(int j = 0; j < i+1; j++) { //출력
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("----------------");
		/*
		 *  *****
		 *  ****
		 *  ***
		 *  **
		 *  *
		 */
		
		for(int i = 0; i < star; i++) {//행을 나타내는 for문
			for(int j = 0; j < star - i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("----------------");
		/*
		 * 		*
		 *     ***
		 *    *****
		 *   *******
		 *  ********* 
		 */
				
		int star2 = 5;
		for(int i = 0; i < star2; i++) {
			for(int j = 4; j > i; j--) { //for(int j = 0; j > star - i -1; j++)
				System.out.print("   ");
			}
			for(int k = 0; k < (2*i)+1; k++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("----------------");
		/*
		 * 	*********
		 *   *******
		 *    *****
		 *     ***
		 *      * 
		 */
		
		//가로, 세로를 입력 받습니다.
		//가로 길이, 세로길이의 사각형을 출력하면 됩니다.
		//단, 윤곽만 나타나도록 처리를 합니다.
		
		
	}

}

package day05;

public class EnhancedForEx {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5};
		
		for(int i : arr ) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("---------------------");
		
		String[] arr2 = {"월","화","수","목","금","토","일"};
		
		for(String str : arr2) {
			System.out.print(str + "요일");
		}
		System.out.println("---------------------");
		
		int[] score = {33, 55, 45};
		//합계, 평균
		int sum = 0;
		for(int i : score) {
			sum += i;
		}
		
		double avg = (double)sum/score.length;
		System.out.print("합계 : " + sum + " 평균 : " + avg);
		System.out.printf("평균 : %.2f\n",avg);
		System.out.println((int)(avg*100)/100.0);
		
		
	}

}

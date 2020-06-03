package day06;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {

		/*
		 * 이름, 성별, 이메일, 출생년도를 입력받아서 각각 배열에 저장
		 * 사람수를 증가시킨다.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("고객의 정보를 관리합니다.");
		String[] nameList = new String[100];
		String[] genderList = new String[100];
		String[] emailList = new String[100];
		int[] birthList = new int[100];


		//현재 고객수가 몇명이 저장되었는지 알기 위한 변수 count 선언
		int count = 0;
		//index를 조정할 변수 선언
		int index = -1;

		end : while(true) {

			System.out.println("[info] - 고객수 : " + count + ", 현재위치 : " + index);
			System.out.println("[메뉴]1.Insert, 2.Previous, 3.Next, 4.Current, 5.Update, 6.Delete, 7.Quit");
			System.out.print("메뉴입력>");
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				/*
				 * 이름, 성별, 이메일, 출생년도를 입력받아서 각각 배열에 저장
				 * 사람수를 증가시킨다.
				 */
				System.out.println("=========고객정보 입력을 시작합니다.==========");
				System.out.println("이름을 입력해주세요. ex 홍길동");	
				System.out.print(">");
				String name = scan.next();
				nameList[count] = name;

				System.out.println("성별을 입력해 주세요. ex 남성,여성");				
				System.out.print(">");
				String gender = scan.next();
				genderList[count] = gender;

				System.out.println("이메일을 입력해주세요. ex)abc@abc.com");				
				System.out.print(">");
				String email = scan.next();
				emailList[count] = email;

				System.out.println("생일을 입력해 주세요. ex)0727");				
				System.out.print(">");
				int birth = scan.nextInt();
				birthList[count] = birth;	

				System.out.println("이름 : " + nameList[count]);
				System.out.println("성별 : " + genderList[count]);
				System.out.println("이메일 : " +emailList[count]);
				System.out.println("생년월일 : " + birthList[count]);
				count++;
				//				index++;
				break;
			case 2:
				/*
				 * index가 0이하라면  "이전 고객정보가 없습니다."
				 * 그렇지 않으면 index를 이동해서 이전고객 정보를 출력하면 됩니다.
				 */					
				if(index <= 0) { //이전으로 갈 수 없음
					System.out.println("이전 고객 정보가 없습니다.");
				} else {
					index--;
					System.out.println("이름 : " + nameList[index]);
					System.out.println("성별 : " + genderList[index]);
					System.out.println("이메일 : " +emailList[index]);
					System.out.println("생년월일 : " + birthList[index]);
				}
				break;
			case 3:
				/*
				 * 다음 고개정보를 출력할 수 없는 조건을 생각해서  "다음 고객정보가 없습니다."
				 * 그렇지 않으면 index를 이동해서 다음고객 정보를 출력하면 됩니다.
				 */

				if(index >= count - 1) {
					System.out.println("다음 고객 정보가 없습니다.");
				} else {
					index++;
					System.out.println("이름 : " + nameList[index]);
					System.out.println("성별 : " + genderList[index]);
					System.out.println("이메일 : " +emailList[index]);
					System.out.println("생년월일 : " + birthList[index]);
				}
				break;
			case 4:
				/*
				 * 현재 정보를 출력할 수 있는 조건을 생각해서 현재 정보를 출력하면 됩니다.
				 * 그렇지 않으면 "현재 고객 정보가 없습니다"를 출력하시면 됩니다.
				 */

				System.out.println(Arrays.toString(nameList));
				System.out.print("확인하고 싶은 고객정보의 이름을 입력해 주세요. 이름 : ");
				String name2 = scan.next();

				if(index >= 0 && index < count) {
					for(int i = 0; i < count; i++) {
						if(name2.equals(nameList[i])) { 
							System.out.println("이름 : " + nameList[index]);
							System.out.println("성별 : " + genderList[index]);
							System.out.println("이메일 : " +emailList[index]);
							System.out.println("생년월일 : " + birthList[index]);
						} else {
							System.out.println("현재 고객 정보가 없습니다.");
						}	
					} 
				}
				break;
			case 5:
				/*
				 * 현재 정보를 출력할 수 있는 조건을 생각해서
				 * 스캐너를 통해서 순서대로 이름, 성별, 이메일, 출생년도를 입력받아서 배열의 값을 수정하세요.
				 * 
				 * 그렇지 않으면 "수정할 데이터가 없습니다."를 출력하면 됩니다.
				 */
				System.out.println("=========고객정보 수정을 시작합니다.==========");

				boolean chk = true;

				System.out.println(Arrays.toString(nameList));
				System.out.print("수정하고 싶은 고객정보의 이름을 입력해 주세요. 이름 : ");
				String name3 = scan.next();
				if(index >= 0 && index < count) {
					for(int i = 0; i < count; i++) {
						if(name3.equals(nameList[i])) {
							System.out.print("이름(" + nameList[index] + "):");	
							nameList[index] = scan.next();

							System.out.print("성별(" + genderList[index] + "):");	
							genderList[index] = scan.next();

							System.out.print("이메일(" + emailList[index] + "):");
							emailList[index] = scan.next();

							System.out.print("생년월일(" + birthList[index] + "):");
							birthList[index] = scan.nextInt();

							chk = false;
						}
					}
				}
				if(chk) {
					System.out.println("수정할 데이터가 존재하지 않습니다.");
				} else {
					System.out.println("--------수정 후 정보---------");
					for(int j = 0; j < count; j++) {
						System.out.println("이름 : " + nameList[j]);
						System.out.println("성별 : " + genderList[j]);
						System.out.println("이메일 : " +emailList[j]);
						System.out.println("생년월일 : " + birthList[j]);
					}
				}
				break;
			case 6:
				/*
				 * 현재정보를 삭제할 수 있는 조건을 생각해서
				 * 현재 index부터~~뒤에 있는 배열 요소를 당겨와서 덮어 씌웁니다.
				 * 고객수를 감소시킵니다.
				 *  
				 * 그렇지 않으면 "삭제할 데이터가 존재하지 않습니다."를 출력하면 됩니다.
				 */
				System.out.println("=========고객정보 삭제를 시작합니다.==========");
				boolean chk2 = true;

				System.out.println(Arrays.toString(nameList));
				System.out.print("삭제하고 싶은 고객정보의 이름을 입력해 주세요. 이름 : ");
				String name4 = scan.next();

				if(index >= 0 && index < count) {
					for(int i = 0; i < count; i++) {
						if(name4.equals(nameList[i])) {
							System.out.println(nameList[index] + "님 정보를 삭제합니다");
							for(int j = index; j < count-1; j++) {
								nameList[j] = nameList[j+1];
								genderList[j] = genderList[j+1];
								emailList[j] = emailList[j+1];
								birthList[j] = birthList[j+1];
								chk = false;
							}
							count--;
						}
					}
				}
				if(chk2) {
					System.out.println("고객 정보가 존재하지 않습니다.");
				} else {
					System.out.println("--------삭제 후 정보---------");
					for(int j = 0; j < count; j++) {
						System.out.println("이름 : " + nameList[j]);
						System.out.println("성별 : " + genderList[j]);
						System.out.println("이메일 : " +emailList[j]);
						System.out.println("생년월일 : " + birthList[j]);
					}
				}
				break;
			case 7:
				System.out.println("프로그램을 종료합니다.");
				/*
				 * 무한루프를 완전히 탈출
				 */
				//				System.exit(0);
				break end;
			default:
				System.out.println("메뉴를 잘못 입력했습니다.");
				break;
			}
		}
	}
}

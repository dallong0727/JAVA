package api.io.buffer04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {
	
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		Scanner scan = new Scanner(System.in);
		
		try {
			/*
			 * 순서대로 nextLine을 써서 2문장을 입력받습니다.
			 * 줄바꿈 처리를 한 다음에  file폴더 안에 text3.txt형식으로 파일을 쓰세요
			 */
			bw = new BufferedWriter(new FileWriter("D:\\course\\java\\file\\test3.txt"));
			
			System.out.println("문장을 입력하세요>");
			String str = scan.nextLine();
			String str2 = scan.nextLine();
			bw.write(str + "\r\n" + str2);
			System.out.println("파일이 정상 출력되었습니다.");
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close(); fw.close(); scan.close(); //bs 먼저 닫아야 한다.
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

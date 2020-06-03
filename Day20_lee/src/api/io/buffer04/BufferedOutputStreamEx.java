package api.io.buffer04;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * Buffered가 붙은 클래스는 입출력 속도 향상을 위한 클래스이며 OutputStream은 바이트 기반입니다.
		 * Buffered가 붙은 클래스들은 생성자의 매개변수로 바이트기반 클래스를 받을 수 있습니다.
		 */
		Scanner scan = new Scanner(System.in);
		
		FileOutputStream fs = null; // 하나씩 보낸다.
		BufferedOutputStream bs = null; // 한번에 보낸다.
		
		try {
			bs = new BufferedOutputStream(new FileOutputStream("D:\\course\\java\\file\\text2.txt"));
			
			System.out.println("문장을 입력하세요>");
			String str = scan.nextLine();
			
			bs.write(str.getBytes()); //write()는 매개변수로 바이트 배열을 받습니다.
//			bs.flush(); // 나머지 것 보낸다
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bs.close(); fs.close(); scan.close(); //bs 먼저 닫아야 한다.
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}

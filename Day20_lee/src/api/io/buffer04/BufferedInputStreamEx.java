package api.io.buffer04;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx {

	public static void main(String[] args) {
	
		/*
		 * Buffered가 붙은 클래스는 입출력 속도 향상을 위한 클래스이며 OutputStream은 바이트 기반입니다.
		 * Buffered가 붙은 클래스들은 생성자의 매개변수로 바이트기반 클래스를 받을 수 있습니다.
		 */
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
//			bis = new BufferedInputStream(System.in);
//			System.out.println((char)bis.read());
			
			bis = new BufferedInputStream(new FileInputStream("D:\\course\\java\\file\\test2.txt"));
			while(true) {
				int a = bis.read(); //한글자를 읽어서 반환
				System.out.print((char)a);
				
				if(a == -1) break; //더 이상 읽을 데이터가 없다면 -1을 반환
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close(); fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
	}
}

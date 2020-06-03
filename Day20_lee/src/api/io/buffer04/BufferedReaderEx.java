package api.io.buffer04;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("D:\\course\\java\\file\\text3.text"));
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			String str ="";
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			
		}	
		

	}

}

package static_.singleton;

import java.util.Calendar;

public class SingletonMain {

	public static void main(String[] args) {
				
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.getName());		
		System.out.println(s2.getName());		
		System.out.println(s3.getName());		
		
	}

}

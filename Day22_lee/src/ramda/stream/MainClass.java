package ramda.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("홍길자");
		list.add("홍길자");
		list.add("이순신");
		list.add("박찬호");
		list.add("김유신");
		
		Iterator<String> iter = list.iterator();
			while(iter.hasNext()) {
			System.out.println(iter.next());
		};
		
		System.out.println("----------------------");
		Stream<String> stream = list.stream();
//		stream.forEach(new Consumer<String>() {
//			public void accept(String t) {
//				System.out.println(t);
//			}	
//		});
		
		stream.forEach( (t) -> {
			System.out.println(t);
		});
	
	}

}

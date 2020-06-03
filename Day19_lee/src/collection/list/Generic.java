package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Generic {
	
	//List<?> - 무엇이든 다 들어갈 수 있음.
	//List<? extends String> - String의 자식클래스는 전달가능
	//List<? super Integer> - Integer의 형태를 가지면 전달가능
	
	public static void add(List<?> list) {
		
	}
	
	public static void add2(List<? extends String> list) {
		
	}
	
	public static void add3(List<? super Integer> list) {
		
	}
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Object> list3 = new ArrayList<>();
		
		Generic.add(list1);
		Generic.add(list2);
		Generic.add(list3);
		Generic.add2(list1);
//		Generic.add2(list2);
//		Generic.add2(list3);
//		Generic.add3(list1);
		Generic.add3(list2);
		Generic.add3(list3);
	}
	
}

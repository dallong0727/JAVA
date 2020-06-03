package ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i< 100; i++) {
			list.add(new Random().nextInt(100)+1);
		}
		System.out.print(list.toString());
		System.out.println("\n------------------------");
		
		//중복제거 distinct()
		list.stream().distinct().forEach((num) -> {
			System.out.print(num + " ");
		});
		System.out.println("\n------------------------");
		//걸러내는 기능 filter()
		Stream<Integer> s1 = list.stream().filter((num) -> {
			return num % 2 == 0;
		});
		
		s1.forEach((num) -> {
		System.out.print(num + " ");	
		});
		System.out.println("\n------------------------");
		//정렬 sorted()
		list.stream().sorted().forEach((num) -> {
			System.out.print(num + " ");
		});
		System.out.println("\n------------------------");
		//map()은 메서드의 안에 정의된 새로운 stream으로 반환
		Stream<String> s2 = list.stream().map( (num) -> {
				return num % 2 == 0 ? "짝수" : "홀수";
		});
		s2.forEach((str) -> {
			System.out.print(str + " ");	
		});
		
		System.out.println("\n------------------------");
		
		List<Integer> result = list.stream().filter((num) -> {
			return num % 3 == 0;
		}).collect(Collectors.toList()); //리스트로 바꿔주는 기능
		System.out.println(result.toString());
		
		System.out.println("\n------------------------");
		//list의 중복을 제거하고, 짝수만 찾아낸 다음, 정렬하고, 짝홀수로 변경한 결과를 List로 반환 받고 forEach구문으로 처리
		List<String> s3 = list.stream().distinct().filter((num) -> num % 2 == 0).sorted().map( (num) -> num % 2 == 0 ? "짝수" : "홀수")
				.collect(Collectors.toList());
		
		s3.forEach((str) -> {
			System.out.print(str + " ");	
		});
		
	}

}

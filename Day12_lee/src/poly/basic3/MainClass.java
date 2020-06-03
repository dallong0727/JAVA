package poly.basic3;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

		//다형성이 없다면?
//		Student s1 = new Student("홍길동", 20, "123");	
//		Student s2 = new Student("박찬호", 30, "234");	
//		Student s3 = new Student("손흥민", 20, "345");	
//		
//		Teacher t1 = new Teacher("이승철", 50, "음악");
//		Teacher t2 = new Teacher("김유신", 50, "역사");
//		
//		Employee e1 = new Employee("최강창민", 20, "회계");
//		
//		Student[] arr1 = {s1, s2, s3};
//		Teacher[] arr2 = {t1, t2};
//		Employee[] arr3 = {e1};
//		
//		for(Student s4 : arr1) {
//			System.out.println(s4.info());
//		}
		
		//다형성 적용
		Person s1 = new Student("홍길동", 20, "123");	
		Person s2 = new Student("박찬호", 30, "234");	
		Person s3 = new Student("손흥민", 20, "345");	
		Person t1 = new Teacher("이승철", 50, "음악");
		Person t2 = new Teacher("김유신", 50, "역사");
		Person e1 = new Employee("최강창민", 20, "회계");
		
		
		Person[] arr = {s1, s2, s3, t1, t2, e1};
		
		for(Person p : arr) {
			System.out.println(p.info());
		}
		
		
	}
}

package poly.instanceof_;

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
		Student s1 = new Student("홍길동", 20, "123");	
		
		Teacher t1 = new Teacher("이승철", 50, "음악");
		
		Employee e1 = new Employee("최강창민", 20, "회계");
		
		printInfo(t1);
		
	
		
	}
	
	public static void printInfo(Person p) {
		if(p instanceof Student) { //p값이 Student라면 true 반환
			Student s = (Student)p;
			System.out.println(s.info());
		} else if (p instanceof Teacher) {
			Teacher t = (Teacher)p;
			System.out.println(t.info());
		} else if (p instanceof Employee) {
			Employee e = (Employee)p;
			System.out.println(e.info());
		}
		
		
		
	}
	
}

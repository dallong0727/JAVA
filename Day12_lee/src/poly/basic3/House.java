package poly.basic3;

import java.util.Arrays;

public class House {

//	private Student[] students;
//	private Teacher[] teacher;
//	private Employee[] employee;
//	
//	private int count1 = 0;
//	private int count2 = 0;
//	private int count3 = 0;
//	
//	public House() {
//		students = new Student[100];
//		teacher = new Teacher[100];
//		employee = new Employee[100];
//	}
//	
//	public void setIn(Student s, Teacher t, Employee e) {
//		students[count1] = s;
//		count1++;
//		teacher[count1] = t;
//		count2++;
//		employee[count1] = e;
//		count3++;
//	}
	
	private Person[] person;
	private int count = 0;
	
	public House() {
		person = new Person[10];
	}
	public void getIn(Person p) {
		person[count] = p;
		count++;
	}

	public void print() {
		int i = 0;
		for(Person p : person) {
			System.out.println("내 이름은 : " + p.name + ", 내 나이는 : " + p.age);
			i++;
			if(i == count) {
				break;
			}
		}
	}

	public Person[] House() {
		return person;
	}
	
}

package day07;

public class 클래스07 {

	public static void main(String[] args) {
		/*
		 * 학생정보의 클래스
		 * Student
		 * - 멤버변수 (이름, 나이, 성별, 전화번호, 이메일)
		 * - 메서드 (print)
		 * */

		Student stu = new Student();
		stu.setName("강미연");
		stu.setAge(28);
		stu.girl();
		stu.setNum("010-8856-6238");
		stu.printStudent();
	}
	
}

class Student{
	// 멤버변수 :
	private String name;
	private int age;
	private boolean gender;
	private String num;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
		public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public void boy() {
		gender = true;
		System.out.println("성별 : 남");
	}
	public void girl() {
		gender = false;
		System.out.println("성별 : 여");
	}


	public void printStudent() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("전화번호 : "+num);
//		System.out.println("성별 : "+gender);
	}
	
}
package day07;

import java.util.Scanner;

public class EzenComputer_출력 {

	public static void main(String[] args) {
		
//		EzenCom ec1 = new EzenCom("철수","010-1111-1111");
//		ec1.printInfo();
//		ec1.printCompany();
//		ec1.insertCourse("java", "1개월");
//		ec1.insertCourse("db", "3개월");
//		ec1.printCourse();
//		System.out.println();
		
		/* 
		 * 배열에 5명의 학생 등록
		 * 1. 학생이름으로 검색 2. 지점 이름으로 검색
		 * */
		
		
		EzenCom[] std = new EzenCom[5];
		
		std[0] = new EzenCom("짱구","010-2222-2222","인천");
		std[0].printInfo();
		std[0].insertCourse("java", "1개월");
		std[0].insertCourse("db", "3개월");
		std[0].printCourse();
		std[0].printCompany();
		
		std[1] = new EzenCom("맹구","010-1111-1111", "서울");
		std[1].printInfo();
		std[1].insertCourse("spring", "2개월");
		std[1].insertCourse("java", "2개월");
		std[1].printCourse();
		std[1].printCompany();
		
		std[2] = new EzenCom("철수","010-3333-3333","인천");
		std[2].printInfo();
		std[2].insertCourse("html", "1개월");
		std[2].insertCourse("java", "3개월");
		std[2].printCourse();
		std[2].printCompany();
		
		std[3] = new EzenCom("유리","010-4444-4444","서울");
		std[3].printInfo();
		std[3].insertCourse("spring", "3개월");
		std[3].insertCourse("html", "2개월");
		std[3].printCourse();
		std[3].printCompany();
		
		std[4] = new EzenCom("훈이","010-5555-5555", "부산");
		std[4].printInfo();
		std[4].insertCourse("db", "1개월");
		std[4].insertCourse("java", "1개월");
		std[4].printCourse();
		std[4].printCompany();
		
		String searchName = "유리";
	
		// 향상된 for문
		for(EzenCom tmp : std) {
			if(tmp != null && tmp.getName().equals(searchName)) {
				tmp.printInfo(); // ==주소가 비교
			}
		}
		
//		for(int i=0; i<std.length; i++) {
//			if(std[i].getName().equals(searchName)){
//			std[i].printInfo();
//			}
//		}
		
		/*
		 * String은 == 비교할 수 없음.(참조변수) equals로 비교 !!
		 * */
		
		String searchBranch = "인천";
		for(int i=0; i<std.length; i++) {
			if(std[i] != null && std[i].getBranch().equals(searchBranch)) {
				std[i].printInfo();
				std[i].printCompany();
			}
		}
//		for(EzenCom tmp : std) {
//			if(tmp != null && tmp.getBranch().equals(searchBranch)) {
//				tmp.printInfo();
//				tmp.printCompany();
//			}
//		}
		
		

	}
 
}

class EzenCom {
	
	// 멤버변수 선언
	private String name;
	private String birth;
	private int age;
	private String phone;
	private static final String company="Ezen";
	private String branch="미정"; // 지점
	private String course[] = new String[5]; // 수강과목 : 한명이 여러과목을 수강
	private String period[] = new String[5]; // 수강기간 : 
	private int courseCount;
	
	
	// 생성자
	public EzenCom() {}
	
//	public EzenCom(String name, String birth, int age, String phone) {
//		this.name = name;
//		this.birth = birth;
//		this.age = age;
//		this.phone = phone;
//	}
	public EzenCom(String name, String phone, String branch) {
		this.name = name;
		this.phone = phone;
		this.branch = branch;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public static String getCompany() {
		return company;
	}

	// 메서드
	public void printInfo() { // 학생 기본정보 출력
		System.out.println();
		System.out.println("---------기본정보----------");
		System.out.println("이름 : "+name);
		System.out.println("생년월일 :"+birth);
		System.out.println("나이 : "+age);
		System.out.println("전화번호 : "+phone);
	}
	public void printCompany() { // 학원정보 출력
//		System.out.println();
//		System.out.println("---------학원정보----------");
		System.out.println("학원이름 : "+company);
		System.out.println("지점 : "+branch);
	}
	
	// 수강정보 추가
	public void insertCourse(String course, String period) {
		this.course[courseCount] = course;
		this.period[courseCount] = period;
		courseCount++;
	}	
	//
	public void printCourse() {
		if(course == null || course.length == 0 || courseCount == 0) {
				System.out.println("수강이력이 없습니다.");
				return;
		}
		for(int i=0; i<courseCount; i++) {
//		System.out.println();
//		System.out.println("---------수강정보----------");
		System.out.println("수강과목 : "+course[i]+"("+period[i]+")");
		}	
	
	}
	
} 
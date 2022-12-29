package day07;

/*
 * - 학생기본정보 : 이름, 생년월일, 나이, 전화번호
 * - 학원 정보 : 학원이름=Ezen(final), 지점
 * - 학생수강정보 : 수강과목(n개), 기간(자바-2개월, html-1개월...)
 * ex) 홍길동, 900101, 33, 010-1111-1111
 * 		ezen, 인천
 * 		자바(1개월), db(2개월), html(1개월) 
 * 
 * - 학생의 기본정보 출력하는 메서드
 * - 학생의 학원정보 출력하는 메서드
 * - 학생의 수강정보 출력하는 메서드
 * - 학생의 수강정보 추가하는 메서드
 * - 생성자(필요하다면)
 * */

public class EzenComputer {
	
	// 멤버변수 선언
	private String name;
	private String birth;
	private int age;
	private String phone;
	private static final String hakname="Ezen";
	private String gigum;
	private String studyname[];
	private String month[];
	private int count;
	
	public EzenComputer() {}
	
	public EzenComputer(String name, String birth, int age, String phone) {
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.phone = phone;
	}
	
	public EzenComputer(String gigum) {
		this.gigum = gigum;
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

	public String getGigum() {
		return gigum;
	}

	public void setGigum(String gigum) {
		this.gigum = gigum;
	}

	public String[] getStudyname() {
		return studyname;
	}

	public void setStudyname(String[] studyname) {
		this.studyname = studyname;
	}

	public String[] getMonth() {
		return month;
	}

	public void setMonth(String[] month) {
		this.month = month;
	}

	public static String getHakname() {
		return hakname;
	}

	// 메서드
	public void printStudent() {
		System.out.println("---------기본정보----------");
		System.out.println("이름 : "+name);
		System.out.println("생년월일 :"+birth);
		System.out.println("나이 : "+age);
		System.out.println("전화번호 : "+phone);
	}
	public void printSchool() {
		System.out.println("---------학원정보----------");
		System.out.println("학원이름 : "+hakname);
		System.out.println("지점 : "+gigum);
	}
	public void printInfo() {
		System.out.println("---------수강정보----------");
		System.out.println("수강과목 : "+studyname);
		System.out.println("수강기간 : "+month);
	}
	
	public void printAddInfo(String s, String m) {
		studyname[count] = s;
		month[count] = m;
			count++;
		
		
	}
} 

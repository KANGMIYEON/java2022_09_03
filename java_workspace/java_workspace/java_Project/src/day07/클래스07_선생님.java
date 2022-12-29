package day07;

public class 클래스07_선생님 {

	public static void main(String[] args) {
		/*
		 * 학생정보의 클래스
		 * ComputerStudent
		 * - 멤버변수 (이름, 나이, 성별, 전화번호, 이메일)
		 * - 메서드 (print)
		 * */
		
		ComputerStudent cs = new ComputerStudent();
		cs.print();
		cs.setName("홍길동");
		cs.setPhone("010-1234-5678");
		cs.setGigum("인천");
		cs.print();
		System.out.println("---------------");
		
		ComputerStudent cs2 = new ComputerStudent("김길동", "010-7894-4561");
		cs2.print();
		
		System.out.println("---------------");
		ComputerStudent cs3 = new ComputerStudent("강감찬");
		cs3.print();
		
		System.out.println("---------------");
		cs3.setName("강감창");
		cs3.setPhone("010-8856-6238");
		cs3.print();

	}
	// 메서드 작성위치

}

/*
 * 초기화 방법 : 기본값(null), 명시적초기화, 초기화블럭, 생성자
 * 1. 명시적 초기화 : 멤버변수 선언과 동시에 값을 지정
 * 2. 초기화 블럭 : {} 안에 멤버변수를 초기화
 * 3. 생성자 : 생성자를 활용하여 초기화
 * 기본값 -> 명시적초기화 -> 초기화블럭 -> 생성자  / ex) 생성자가 없으면 초기화 블럭 값
 * */

// 클래스 작성위치
class ComputerStudent{
	
	// 멤버변수 : 지점(String), 이름(String), 과정(String), 전화번호(String)
	private String gigum="인천"; // 명시적 초기화
	private String name;
	private String group;
	private String phone;
	{
		// 초기화 블럭 : 멤버변수 초기화
		group="미정";
	}
	// 생성자 : 멤버변수 초기화
	public ComputerStudent() {} // 기본생성자 / new 객체 만들 때!
	
	public ComputerStudent(String name) { // 이름만 받는 생성자 => 초기에 한 번만 사용! 그 다음에는 setter로 변경해줌
		this.name = name;
	}
	public ComputerStudent(String name, String phone) { // 이름, 전화번호만 받는 생성자
		this.name = name;
		this.phone = phone;
	}
	public String getGigum() {
		return gigum;
	}
	public void setGigum(String gigum) {
		this.gigum = gigum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void print() {
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+phone);
		System.out.println("지점 : "+gigum);
		System.out.println("반 : "+group);
	}
}

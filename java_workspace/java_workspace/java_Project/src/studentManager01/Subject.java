package studentManager01;
/*
 * 2. 과목클래스(별도생성!!)
 * 과목클래스 : 한과목의 정보를 나타내는 클래스
 * 멤버변수 : 과목코드(subCode), 과목명(subName), 학점(subCredit), 시수(subTime),
 * 			교수명(subProfessor), 학기(subSemester), 분류(subCategory),
 * 			수업시간표(subScheduler)
 * getter/setter, toString() 사용하기
 * 생성자
 * */

public class Subject {
	
	// 멤버변수선언
	private String subCode;
	private String subName;
	private double subCredit;
	private int subTime;
	private String subProfessor;
	private String subSemester;
	private String subCategory;
	private String subScheduler;
	
	// subPrint메서드
	public void subPrint() {
		System.out.println("---subject---");
		System.out.println("과목명 : "+subName);
		System.out.println("과목코드 : "+subCode);
		System.out.println("이수학점 : "+subCredit+"점");
		System.out.println("이수시간 : "+subTime+"시간");
		System.out.println("담당교수 : "+subProfessor);
		System.out.println("수강학기 : "+"subSemester");
		System.out.println("수강분류 : "+subCategory);
		System.out.println("수업시간 : "+subScheduler);
	}
	
	// toString
	@Override
	public String toString() { // sysout 안에 씌워줘야 함
		return "Subject [subName=" + subName + ", subCode=" + subCode + ", subCredit=" + subCredit + ", subTime="
				+ subTime + ", subProfessor=" + subProfessor + ", subSemester=" + subSemester + ", subCategory="
				+ subCategory + ", subScheduler=" + subScheduler + "]";
	}

	// 기본 생성자
	public Subject() {}
	
	// 이름만 넣는 생성자
	public Subject(String subName) {
		this.subName = subName;
	}
		
	// 전체 요소를 담는 생성자
	public Subject(String subCode, String subName, double subCredit, int subTime, String subProfessor,
			String subSemester, String subCategory, String subScheduler) {
		super();
		this.subCode = subCode;
		this.subName = subName;
		this.subCredit = subCredit;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subSemester = subSemester;
		this.subCategory = subCategory;
		this.subScheduler = subScheduler;
	}

	// getter/setter
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public double getSubCredit() {
		return subCredit;
	}
	public void setSubCredit(double subCredit) {
		this.subCredit = subCredit;
	}
	public int getSubTime() {
		return subTime;
	}
	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}
	public String getSubProfessor() {
		return subProfessor;
	}
	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}
	public String getSubSemester() {
		return subSemester;
	}
	public void setSubSemester(String subSemester) {
		this.subSemester = subSemester;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getSubScheduler() {
		return subScheduler;
	}
	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}
	
	
}

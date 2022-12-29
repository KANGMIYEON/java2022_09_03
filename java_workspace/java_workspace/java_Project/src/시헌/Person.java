package 시헌;

public class Person {
//	정답은 :
//		이름 : 성시헌
//		나이 : 27
//		주소 : 인천
//		전화 : 010-8961-5127
//		반려동물 : 말랑이
//		근데 클래스 1 : 이름과, 나이만
//		클래스 2는 : 주소랑 전화만
//		클래스 3 : 반려동물만
	
	private String name;
	private int age;
	
	public Person() {}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public void printPerson() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		
	}
}

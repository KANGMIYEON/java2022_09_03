package day07;

public class 클래스06 {

	public static void main(String[] args) {
		/*
		 * static이 붙은 멤버변수/메서드는 클래스의 멤버변수/메서드가 된다. => 다같이 쓰자~!
		 * static이 안 붙은 멤버변수/메서드는 객체(인스턴스)의 멤버 변수가 된다. => 나만 쓸게
		 * 
		 * - 객체의 멤버변수/메서드는 객체를 통해 사용된다.
		 * - 객체 멤버변수는 각 객체마다 멤버변수를 생성한다.
		 * - 클래스의 멤버변수/멤버메서드는 클래스를 통해 사용된다.
		 * - 클래스명.메서드명 => 객체생성 없이 사용 가능
		 * (객체를 통해서도 사용은 가능하나 일반적이지는 않다.)
		 * - 클래스 멤버변수는 하나의 멤버변수를 모든 객체가 공유한다.
		 * 
		 * - 클래스/객체 변수는 생성 시점이 달라서 메서드에 사용될 수 있는 환경이 다르다.
		 * - 객체멤버 변수는 클래스멤버 메서드에서 사용할 수 없다.
		 * - 객체멤버 변수는 객체멤버 메서드에서만 사용할 수 있다.
		 * - 클래스멤버 변수는 클래스/객체 멤버 메서드에서 사용할 수 있다.
		 * - 클래스멤버 메서드는 클래스/객체 멤버 메서드에서 사용할 수 있다.
		 * - 객체멤버 메서드는 객체멤버 메서드에서만 사용할 수 있다.
		 * 
		 * - 객체 멤버 변수는 생성시점이 객체가 생설될 때 변수가 생성된다.
		 * - 클래스 멤버변수는 클래스가 메모리에 올라가는 순간 생성된다.
		 * = > 클래스 멤버변수는 객체가 만들어지지 않아도 생성된다.
		 * 
		 * - final은 클래스, 변수, 메서드에 붙일 수 있다.
		 * - final(최종, 마지막) : 수정할 수 없다. (setter 불가)
		 * - final 멤버변수 : 상수(변경할 수 없는 값)
		 * - final 멤버메서드 : 오버라이딩(메서드 재정의) 할 수 없다.
		 * - final 클래스 : 상속할 수 없다. 부모 클래스가 될 수 없다.
		 * */
		
//		Tv t = new Tv();
//		t.turnOn();
//		t.setBrand("Samsung");
//		t.printBrand();
		
//		System.out.println("--------------");
		
//		Tv t1 = new Tv();
//		t1.setBrand("LG");
//		t1.printBrand();
//		t.printBrand();
		
//		=Math.PI; // 대표적인 final 값

	}

	
	
}

/*
 * Tv 클래스 생성
 * - 멤버변수(private으로 선언)
 * power, brand(getter/setter)
 * - 메서드
 * turnOn, turnOff
 * printBrand(sysout)
 * */

class Tv{ // 멤버변수 선언(private) - 메서드 선언(public) - 생성자
	
	//멤버변수 선언
	private boolean power;
	private static final String brand="Samsung"; // final을 붙이면 최종의 값이 됨 (변경불가)
//	private final static String brand="Samsung"; 으로 작성해도 상관없음
	
	public void turnOn() {
		power = true;
		System.out.println("전원이 켜졌습니다.");
	}
	public void turnOff() {
		power = false;
		System.out.println("전원이 꺼졌습니다.");
	}
	public void printBrand() {
		System.out.println("제조사 : "+brand);
	}
//	public String getBrand() {
//		return brand;
//	}
//	public void setBrand(String brand) { // brand에 final이 붙어서 사용할 수 없게 됨
//		this.brand = brand;
//	}
	
	
}
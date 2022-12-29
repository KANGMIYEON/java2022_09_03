package day08;

public class 참조변수의형변환 {

	public static void main(String[] args) {
//		int num1 = 5;
//		int num2 = 3;
//		double num3 = (double)num1 / num2;
		
		// 자식을 부모로 형변환 하는 경우 무조건 가능.
		P p = new P();
		C c = new C();
		P c1 = new C(); // 자동으로 변환 가능. new (P)C(); 
		System.out.println(c1.num1);
//		System.out.println(c1.num2); // error.
		P p2 = c; // 자동으로 변환 가능. 
		
		// 부모를 자식으로 형변환 하는 경우 형변환 생략 불가, 조건부로 에러가 발생할 수도 안 할 수도 있음.
		
		// 1. 에러가 발생하지 않은 경우
		// 부모의 참조변수가 자식의 객체랑 연결되어 있는 경우
		// 이 부모의 객체를 다시 자식의 객체로 형변환 가능.
		P p3 = new C(); // 부모를 자식 객체와 연결
		C c3 = (C)p3;
		System.out.println(c3.num1);
		System.out.println(c3.num2);
		System.out.println(p3 instanceof C);
		
		// 2. 에러가 발생하는 경우 (예외 발생)
		P p1 = new P();
//		C c4 = (C)p1;
//		System.out.println(c4.num1); // 예외 발생 ClassCastException
		// 참조객체p1이 C클래스로 형변환 가능한지 체크
		if(p1 instanceof C) { 
			System.out.println("형변환이 가능합니다.");
		} else {
			System.out.println("형변환이 불가능합니다.");
		}
		
		
	}

}
class P{
	int num1 = 10;
}

class C extends P{
	int num2 = 20;
}


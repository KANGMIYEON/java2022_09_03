package day05;

public class 클래스03 {

	public static void main(String[] args) {
		/*
		 * < 오버로딩의 조건 >
		 * - 매개변수의 개수가 다른 경우
		 * - 매개변수의 자료형이 다른 경우
		 * */
		
//		System.out.println(sum(10, 20));
//		System.out.println(sum(1.5, 2.5));
//		System.out.println(sum(10, 20, 30));
		
		
		Card c = new Card();
		
		c.print();
		
		c.setNum(5);
		c.setShape('♣');
		c.print();
		
		// 범위가 넘어가는 경우 기본값으로 출력됨
		c.setNum(20);
		c.setShape('★');
		c.print();
		
	}
	
	/* 두 정수를 주고 합계를 리턴 */
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	/* 세 정수를 주고 합계를 리턴 */
	
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
}

/*
 * Card 클래스 : 포커게임에서 사용하는 카드를 나타내는 클래스
 * 	모양 : 하트, 클로버, 다이아, 스페이드
 * 	숫자 : 1~10 J Q K
 * 	카드에 대한 정보를 출력
 * 
 * 클래스의 구성
 * - 멤버변수 : int num, char shape
 * - 메서드 : print
 * - 생성자 : 클래스의 멤버변수를 초기화 하는 메서드
 * - 클래스의 생성자가 하나도 없으면 기본 생성자가 자동으로 생성
 * - 생성자를 하나라도 선언하게 되면 기본생성자는 만들어지지 않음. (생성자를 만들면 기본 생성자도 내가 만들어야함!)
 * 
 * - 생성자 선언방법
 * public 클래스명(){ => 생성자
 * 초기값;
 * }
 * 
 * - 메서드 오버로딩
 * : 매개변수가 다른 같은이름의 메서드를 만들어주는 것
 * - 생성자도 오버로딩 가능.
 * */

class Card {
	
	private int num; // 숫자
	private char shape; // 모양
	
	// 생성자 : 객체의 초기값을 결정
	public Card() {
		shape = '♥';
		num = 1; // num 값을 안 주면 0이 기본값
	}
	
	// print메서드
	// num, shape을 출력하는 메서드
	public void print() {
		 System.out.print(shape);
		 switch(num) {
		 case 11:
			 System.out.println("J");
			 break;
		 case 12:
			 System.out.println("Q");
			 break;
		 case 13:
			 System.out.println("K");
		 default:
			System.out.println(num);
		 }
	}
	// getter / setter 							// source-
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num<1 || num>13) {
			this.num = 1;
		} else {
		this.num = num;
		}
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		switch(shape) {
			case '♥': case '♣': case '◆': case '♠':
				this.shape = shape;
				break;
			default:
				this.shape = '♥';
			}
		
	} 
	
}
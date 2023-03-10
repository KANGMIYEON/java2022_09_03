package day06;

public class Method09 {

	public static void main(String[] args) {
		/*
		 * 계산기 만들기
		 * calc(1, 2, + - * / %) 5가지 경우
		 * calc(1.4, 2.1, + - * / %) 5가지 경우
		 * 메서드 오버로딩을 이용하여 두 정수와 연산자, 두 실수와 연산자 값을 입력했을 때
		 * 연산의 결과가 출력되는 calc 메서드를 완성하시오.
		 * */
		
		System.out.println(calc(1, 2, '+'));
		System.out.println(calc(1.2, 1.5, '*'));
		
	}
	
	
	public static int calc(int num1, int num2, char ch) {
		
		switch(ch) {
			case '+': return num1 + num2;
			case '-': return num1 - num2; 
			case '*': return num1 * num2; 
			case '/': return num1 / num2;
			case '%': return num1 % num2;
			default: return 0;
		}
	}
	
	public static double calc(double num1, double num2, char ch) {
		
		switch(ch) {
		case '+': return num1 + num2;
		case '-': return num1 - num2; 
		case '*': return num1 * num2; 
		case '/': return num1 / num2;
		case '%': return num1 % num2;
		default: return 0;
		}
		
	}

}

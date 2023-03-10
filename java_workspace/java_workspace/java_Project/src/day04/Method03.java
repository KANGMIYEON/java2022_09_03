package day04;

public class Method03 {

	public static void main(String[] args) {
		/* 최대공약수, 최소공배수 메서드 */
		System.out.println(gcd(8, 12));
		System.out.println(lcm(10, 15));
		System.out.println(lcm2(10, 15));
	}
	
	/*
	 * 기능 : 두 정수의 최대공약수를 구하는 메서드
	 * 매개변수 : 두 정수
	 * 리턴타입 : 최대공약수
	 * 메서드명 : gcd
	 * */
	
	public static int gcd (int num1, int num2) {
		int g = 0;
		for(int i=1; i<=num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				g = i;
			}
		}
		return g;
	}
	
	/*
	 * 기능 : 두 정수의 최소공배수를 구하는 메서드
	 * 매개변수 : 두 정수
	 * 리턴타입 : 최소공배수
	 * 메서드명 : lcm
	 * */
	
	public static int lcm (int num1, int num2) {
		for(int i=num1; ;i=i+num1) {
			if(i % num1 == 0 && i % num2 == 0) {
				return i;
			}
		}
	}
	
	
	/*
	 * 최소공배수 == 두 수를 곱한 후 최대공약수로 나누기
	 * 10 * 15 / 5 = 30
	 * */
	
	public static int lcm2 (int num1, int num2) {
		return num1*num2/gcd(num1, num2);
	}
}

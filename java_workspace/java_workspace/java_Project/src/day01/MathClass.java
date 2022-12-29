package day01;

public class MathClass {

	public static void main(String[] args) {
		// Math.method
		// 반올림 (Math.round)
		double num1 = 5.1234;
		System.out.println(Math.round(num1)); // 5
		// 절대값(Math.abs)
		System.out.println(Math.abs(-1)); // 1
		// Math.max, Math.min
		System.out.println(Math.max(3, 5)); // 둘 중에 큰 값 5
		System.out.println(Math.min(1, 6)); // 둘 중에 작은 값 1
		//Math.ceil, Math.floor
		System.out.println(Math.ceil(5.1234)); // 올림 6.0
		System.out.println(Math.floor(5.1234)); // 버림 5.0
		//Math.power(제곱), Math.sqrt(루트), Math.random
		System.out.println(Math.pow(2, 3)); // 8.0
		System.out.println(Math.sqrt(25)); // 5.0
		System.out.println(Math.random()); // 0~1 사이의 아무값
		
		int random = (int)(Math.random()*10)+1; // 1~10까지의 정수, 10개의 정수 1부터 시작
		System.out.println(random);
	}

}

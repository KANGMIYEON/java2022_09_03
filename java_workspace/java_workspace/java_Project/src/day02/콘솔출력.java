package day02;

public class 콘솔출력 {

	public static void main(String[] args) {
		/*
		 * System.out.println(); // 줄바꿈
		 * System.out.print(); // 줄바꿈 안 됨
		 * System.out.printf(); // 지시자를 통해 값 표현
		 * %n(\n 줄바꿈), %d(정수형), %f(실수형), %c(문자열)
		 * */
		int num1 = 3;
		int num2 = 5;
		// num1 + num2의 결과를 출력 3 + 5 = 8
		System.out.println(num1+num2);
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.printf("%d+%d=%d",num1,num2,(num1+num2));
	}

}

package day02;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		/*
		 * 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력
		 * 1+2=3, 1*3=3
		 * 연산자(+-* /)
		 * */
		Scanner scan = new Scanner(System.in);
		// next() : 공백을 포함하지 않는 단어 .charAt(위치); 0번부터 시작
		// nextLine() 공백을 포함하는 문장
		System.out.println("숫자를 입력하세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("연산자를 입력하세요.");
		char op = scan.next().charAt(0); // 0번째 index(위치) 한글자만 받음
		
		switch(op) {
		case '+':
			System.out.printf("%d+%d=%d",num1,num2,(num1+num2));
			break;
		case '-':
			System.out.printf("%d-%d=%d",num1,num2,(num1-num2));
			break;
		case '*':
			System.out.printf("%d*%d=%d",num1,num2,(num1*num2));
			break;
		case '/':
			System.out.printf("%d/%d=%d",num1,num2,(num1/num2));
//			System.out.println(num1+""+op+""+num2+"="+(num1/num2));
			break;
		default:
			System.out.println("잘못된 값입니다.");
		}
		
		scan.close();
	}

}

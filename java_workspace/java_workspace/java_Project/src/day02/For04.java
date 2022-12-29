package day02;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		/*
		 * 최대 공약수 찾기
		 * 두 정수 num1, num2 입력받아 최대 공약수를 출력
		 * 공약수 : 각 정수의 약수 중 공통적으로 있는 약수
		 * 최대 공약수 : 공약수 중 가장 큰 수
		 * 
		 * 8, 12의 최대공약수
		 * 8, 12 : 1, 2, 4	=> 4 출력
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 두개를 입력하세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int gcd=0; // 최대공약수를 담을 변수

		int i;
		for(i=1; i<=num1; i++) {
			if(num1%i==0 && num2%i==0) { // 두 값이 공통적으로 나누어 떨어지는지 확인
				gcd = i; // 마지막에 담기는게 최대공약수
			}
		}
		System.out.println("두 수의 최대공약수 : "+gcd);
		
		/*
		 * 반복 횟수 : num1부터 1씩 감소
		 * break; 조건이 맞다면 더이상 for문을 돌지 않고 빠져나옴
		 * */
		for(i=num1; ; i--) {
			if(num1%i==0 && num2%i==0) {
				System.out.println("두 수의 최대공약수 : "+i);
				break;
			}
		}
		
		scan.close();
		
	}
}

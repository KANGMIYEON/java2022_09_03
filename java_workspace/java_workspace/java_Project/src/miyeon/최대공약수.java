package miyeon;

import java.util.Scanner;

public class 최대공약수 {

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
		System.out.println("숫자 두개를 입력해 주세요 >>");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int i;
		int gcd = 0;
		
		// case 1.
		for(i=1; i<=num1; i++) {
			if(num1%i==0 && num2%i==0) {
				gcd = i;
			}
		}
		System.out.println("최대 공약수: "+gcd);
		
		// case 2.
		for(i=num1; ; i--) {
			if(num1%i==0 && num2%i==0) {
				System.out.println("최대 공약수: "+gcd);
				break;
			}
		}

	}

}

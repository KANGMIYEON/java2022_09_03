package day02;

import java.util.Scanner;

public class Break문 {

	public static void main(String[] args) {
		/*
		 * break문 : 반복문을 빠져나오게 만드는 키워드
		 * - 반복문에서 break는 조건(if문)을 동반하게 된다.
		 * */
		// 1~10까지 출력
		// 초기화 1~무한대, 1씩 증가
		// 조건 i가 10이되면 break;
		
		for(int i=1; ; i++) {
			System.out.println(i);
			if (i==10) {
				break;
			}
			
		}
		
		/*
		 * 한글자를 입력받아 글자를 출력.
		 * y를 입력 받으면 종료
		 * 초기값 : 생략
		 * 조건식 : 생략
		 * 증감식 : 생략 // 무한루프
		 * 실행문 : 실행하되 조건을 부여 => y를 입력받으면 break;
		 * */
		
		for( ; ; ) {
			Scanner scan = new Scanner(System.in);
			System.out.println("문자를 입력하세요.");
			char ch = scan.next().charAt(0);
			System.out.println("입력한 문자 : "+ch);
			if(ch=='y' || ch=='Y') {
				System.out.println("종료합니다.");
				break;
			}
		}
		
	}

}

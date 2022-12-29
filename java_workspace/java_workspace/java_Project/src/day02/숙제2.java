package day02;

import java.util.Scanner;

public class 숙제2 {

	public static void main(String[] args) {
		/*
		 * 1~50 사이의 랜덤한 수 1개 생성하여 맞추는 게임.
		 * ex) 컴퓨터가 생성한 랜덤수: 45
		 * 입력: 10
		 * up
		 * 입력: 30
		 * up
		 * 입력: 46
		 * down
		 * 입력: 45
		 * 정답입니다.
		 * */
		/*
		 * 1. 랜덤수 생성
		 * 2. 스캐너 열기
		 * 3. 반복문(while) -> 입력받기
		 * 4. 랜덤 입력받은 값 비교 (if)
		 * */
		
		int answer = (int)(Math.random()*50)+1; // 1~50까지의 랜덤수 생성
		Scanner scan = new Scanner(System.in);
		//System.out.println("answer = "+answer); 
		int input = 0; // 입력받을 변수 초기화 준비
//		int count = 0; // 몇회만에 맞췄는지 나타낼 수 있음
		do {
			System.out.println("1~50 사이의 숫자를 맞추세요.");
				answer = scan.nextInt();
//				count++;
				if (input < answer){
					System.out.println("up");
				} else if (input > answer) {
					System.out.println("down");
				} else {
					System.out.println("입력값이 바르지 않습니다.");
				}
			} while(input != answer);
				System.out.println("정답입니다.");
			
				
				scan.close();
		
	}

}

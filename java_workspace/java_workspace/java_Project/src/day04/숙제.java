package day04;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		// 가위바위보게임 만들기
		// 컴퓨터가 가위바위보를 랜덤으로 선택 (0=가위, 1=바위, 2=보)
		// 내가 가위바위보 중 하나를 선택해서 입력 (가위,바위,보)
		// 승패무의 결과를 출력
		// 조건식 ? 참 : 거짓;
		// 조건식 ? 참 : 조건식? 참 : 거짓;

		Scanner scan = new Scanner(System.in);
		System.out.println("가위, 바위, 보 중 하나를 입력해주세요.");
		String user = scan.nextLine();
		System.out.println("me : "+user);
		int computer = (int)(Math.random()*3);
		
		switch(computer) {
			case 0: // 가위
				System.out.println("computer : 가위");
				if(user.equals("가위")) {
					System.out.println("비겼습니다.");
				} else if (user.equals("바위")) {
					System.out.println("이겼습니다.");
				} else if (user.equals("보"))
					System.out.println("졌습니다.");
				break;
			case 1: // 바위
				System.out.println("computer : 바위");
				if(user.equals("가위")) {
					System.out.println("졌습니다.");
				} else if (user.equals("바위")) {
					System.out.println("비겼습니다.");
				} else if (user.equals("보"))
					System.out.println("이겼습니다.");
				break;
			case 2: // 보
				System.out.println("computer : 보");
				if(user.equals("가위")) {
					System.out.println("이겼습니다.");
				} else if (user.equals("바위")) {
					System.out.println("졌습니다.");
				} else if (user.equals("보"))
					System.out.println("비겼습니다.");
				break;
		
		}	
		
	
	}

}

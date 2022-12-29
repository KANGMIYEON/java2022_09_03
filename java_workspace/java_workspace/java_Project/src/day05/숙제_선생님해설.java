package day05;

import java.util.Scanner; // "ctrl + shift + O"

public class 숙제_선생님해설 {

	public static void main(String[] args) {
		/*
		 * < 야구게임 >
		 * 컴퓨터가 3자리의 숫자를 생성 (1~9까지)
		 * 유저가 3자리의 숫자를 맞추는 게임
		 * 자리가 일치하는 숫자는 strike
		 * 숫자만 맞으면 ball
		 * 아무것도 안 맞으면 out
		 * 
		 * ex) 컴퓨터 생성번호 :123		사용자입력번호 : 243 1b 1s		3s 되면 끝
		 * */
		
		Scanner sc = new Scanner(System.in);
		int count = 0; // 시도횟수
		int comNum[] = new int[3]; // 컴퓨터 배열
		int myNum[] = new int[3]; // 내 배열
		
		// 앞에서 썼던 메서드를 불러온다면...
		// static 클래스의 객체를 생성하지 않아도 불러올 수 있다. 26~27라인처럼 작성하지 않고 28라인처럼 작성해도 가능!
//		Method07_lotto me = new Method07_lotto();
//		me.randomArray(comNum);
//		Method07_lotto.randomArray(comNum); => 범위가 달라서 사용하지는 않겠음 ~
		
		// 컴퓨터 숫자를 중복되지 않게 추출
		for(int i=0; i<comNum.length; i++) {
			comNum[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(comNum[j] == comNum[i]) {
					i--;
					break;
				}
			}
		} 
		
		// 컴퓨터 숫자 추출 결과체크
		for(int a : comNum) {
			System.out.print(a+" ");
		}
		
		while(true) {
			int stk=0, ball=0;
			System.out.println();
			System.out.println("숫자를 입력해주세요 >> ");
			
			// 문자로 입력받는 경우.
			String myStr = sc.next(); // 숫자를 문자로 받은 경우.
			String[] myNumStrArr = myStr.split(""); // 한글자마다 잘라서 배열로 저장
			count++; // 1회 증가
			
			// 입력받은 문자를 숫자로 변환하여 내배열에 저장
			for(int i=0; i<myNum.length; i++) {
				myNum[i] = Integer.parseInt(myNumStrArr[i]);
			}
			
			// 숫자와 자릿수 비교
			for(int i=0; i<comNum.length; i++) { // 컴퓨터 기준 탐색
				for(int j=0; j<myNum.length; j++) { // 내 기준 탐색
					if(comNum[i] == myNum[j] && i == j) { // 값 && 자릿수도 같다면
						stk++;
					} else if(comNum[i] == myNum[j] && i != j) { // 값은 같고, 자리는 일치하지 않을 때
						ball++;
					}
					
				}
			}
			
			// 출력
			if(stk == 0 && ball == 0) {
				System.out.println("OUT!!");
			} else {
				System.out.println("시도횟수 : "+count);
				System.out.println(" > "+stk+"S "+ball+"B");
			}
			if(stk==3) {
				System.out.println("축하합니다~!! 게임종료");
				System.out.println("시도횟수 : "+count);
				break; // while문 빠져나가기
			}
		}	
		
		
		sc.close();
	}

}

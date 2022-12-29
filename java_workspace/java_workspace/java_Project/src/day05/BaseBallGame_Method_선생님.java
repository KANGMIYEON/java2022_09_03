package day05;

import java.util.Scanner;

public class BaseBallGame_Method_선생님 {

	public static void main(String[] args) {
		/*
		 * < 야구게임 메서드화 >
		 * 컴퓨터가 3자리의 숫자를 생성 (1~9까지 랜덤생성, 중복X)
		 * 사용자 번호는 직접 입력
		 * 자리가 일치하는 숫자는 strike
		 * 숫자만 맞으면 ball
		 * 아무것도 안 맞으면 out
		 * 
		 * ex) 컴퓨터 생성번호 :123		사용자입력번호 : 243 1b 1s		3s 되면 끝
		 * */
		
		int com[] = new int[3];
		int user[] = new int[3];
		int max=9, min=1;
		int s=0, b=0;
		
		Scanner sc = new Scanner(System.in);
		createArray(com, min, max);
		Method07_lotto.printArray(com); // static일 때 다른 곳에서 메서드 불러올 수 있음
		System.out.println();
		while(s!=3) {
			// 사용자번호 입력받기
			System.out.println("1~9 숫자 3개 입력해주세요 >> ");
			int cnt=0;
			while(cnt<3) {
				user[cnt] = sc.nextInt();
				cnt++;
			}
			s = strike(com, user);
			if(s!=0) {
				System.out.println(s+"S");
			}
			b = ball(com, user);
			if(b!=0) {
				System.out.println(b+"B");
			}
			if(s==0 && b==0) {
				System.out.println();
				System.out.println("OUT!!");
			}
		}
		System.out.println("종료합니다.");
	
	}
	
	/*
	 * 컴퓨터 랜덤 배열 생성
	 * 1~9까지의 랜덤 값
	 * min=1, max=9 (max-min+1) = 개수
	 * (int)(Math.random()*(max-min+1))+min
	 * */
	
	public static int random(int max, int min) {
		if(max < min) { // max와 min 값이 바뀐다면
			int tmp = max;
			max = min;
			min = tmp;
			
		}
		return (int)(Math.random()*(max-min+1))+min;
	}
	
	// 중복 안 되게 배열 생성
	public static boolean createArray(int arr[], int min, int max) {
		if(arr == null) { // 배열생성이 안 된 경우
			return false;
		}
		if((max-min+1) < arr.length) { // 랜덤 생성 개수가 배열의 index보다 작으면 X
			return false;
		}
		int cnt=0;
		while(cnt < arr.length) {
			int r = random(min,max);
			if(!Method07_lotto.isContain(arr, r)) {
				arr[cnt]=r;
				cnt++;
			}
		}
		return true;
	}
	
	
	/*
	 * 스트라이크 판정하는 메서드
	 * 기능 : 컴퓨터의 값과 유저의 값이 위치와 숫자가 일치하면 카운트하여 반환 기능
	 * 메서드명 : strike
	 * */
	
	public static int strike (int com[], int user[]) {
		int cnt = 0 ;
		for(int i=0; i<com.length; i++) {
			for(int j=0; j<user.length; j++) {
				if(com[i] == user[j] && i == j) {
					cnt++;
				} 
			}
		}
		return cnt;
	}
	
	
	
	/*
	 * 볼 판정하는 메서드
	 * 기능 : 컴퓨터의 값과 유저의 값이 숫자만 일치하면 카운트하여 반환 기능
	 * 메서드명 : ball
	 * */
	
	public static int ball (int com[], int user[]) {
		int cnt = 0;
		for(int i=0; i<com.length; i++) {
			if(isContain(user, com[i])) {
				cnt++;
				// 스트라이크도 체크
			}
		}
		return cnt - strike(com, user);
	}
	
	/*
	 * 배열 출력 메서드
	 * 리턴타입 : void
	 * sysout
	 * */
	
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"");
		}
		System.out.println(); // 줄바꿈 포함
	}
	
	/*
	 * 중복확인 메서드
	 * 메서드명 : isContain
	 * 리턴타입 : boolean
	 * */
	
	public static boolean isContain(int arr[], int num) {
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		} return false;
	}

}

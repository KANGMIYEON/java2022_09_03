package day05;

import java.util.Scanner;

public class BaseBallGame_Method {

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
		
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		random(comNum);
		printArray(comNum);
		
		// if 사용해서 출력은 main에서 함
		
		while(true) {
			System.out.println("3자리 숫자를 맞춰주세요. >> ");
			for(int i=0; i<3; i++) {
				myNum[i] = sc.nextInt();
			}	count++;
				
			int stk = strike(comNum, myNum);
			int bal = ball(comNum, myNum);
				
			if(stk == 0 && bal == 0) {
				System.out.println("OUT!!");
			} else {
				System.out.println("시도횟수 : "+count);
				System.out.println(" > "+stk+"S "+bal+"B");
			}
			if(stk==3) {
				System.out.println("축하합니다~!! 게임종료");
				System.out.println("시도횟수 : "+count);
				break;
			}
		}
	
	}
	
	/*
	 * 컴퓨터 랜덤 배열 생성
	 * 1~9까지의 랜덤 값
	 * min=1, max=9 (max-min+1) = 개수
	 * (int)(Math.random()*(max-min+1))+min
	 * */
	
	public static int random2(int max, int min) {
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
			int r = random2(min,max);
			if(!Method07_lotto.isContain(arr, r)) {
				arr[cnt]=r;
				cnt++;
			}
		}
		return true;
	}
	
	
	
	public static void random(int arr[]) {
		for(int i=0; i<arr.length; i++) {
		int r = (int)(Math.random()*9)+1;
		if(!isContain(arr, r)) {
			arr[i] = r;
			} else {
				i--;
			}
		}
		 
	}
	
	/*
	 * 스트라이크 판정하는 메서드
	 * 기능 : 컴퓨터의 값과 유저의 값이 위치와 숫자가 일치하면 카운트하여 반환 기능
	 * 메서드명 : strike
	 * */
	
	public static int strike (int arr1[], int arr2[]) {
		int stk = 0 ;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j] && i == j) {
					stk++;
				} 
			}
		} return stk;
	}
	
	
	
	/*
	 * 볼 판정하는 메서드
	 * 기능 : 컴퓨터의 값과 유저의 값이 숫자만 일치하면 카운트하여 반환 기능
	 * 메서드명 : ball
	 * */
	
	public static int ball (int arr1[], int arr2[]) {
		int ball = 0;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j] && i != j) {
					ball++;
				}
			}
		} return ball;
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

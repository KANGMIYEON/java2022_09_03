package day05;

import java.util.Scanner;

public class 숙제 {

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
		System.out.println("3자리 숫자를 맞춰주세요.");
		
		
		
		int com[] = new int[3];
		
		int out = 0;
		
		//컴퓨터 배열
		randomArray(com);
		System.out.println(com[0]);
		System.out.println(com[1]);
		System.out.println(com[2]);
		
		//사용자 배열입력
		
		while(out<3) {
			int strike = 0;
			int ball = 0;
			
			int[] user = new int[3];
			for(int i=0; i<3; i++) {
				user[i]  = sc.nextInt();
			}
			
			if(com[0]==user[0] && com[1]==user[1] && com[2]==user[2]) {
				System.out.println("정답입니다~~!!");
			}
			
			
			if(user[0] == com[0]) {
				strike++;
			} else if(user[0] == com[1]) {
				ball++;
			} else if(user[0] == com[2]) {
				ball++;
			}
			
			if(user[1]==com[1]) {
				strike++;
			} else if(user[1] == com[0]) {
				ball++;
			} else if(user[1] == com[2]) {
				ball++;
			}
			
			if(user[2]==com[2]) {
				strike++;
			} else if(user[2] == com[0]) {
				ball++;
			} else if(user[2] == com[1]) {
				ball++;
			}
			
			if(strike == 0 && ball == 0) {
				out++;
			}
			System.out.println(strike+" "+ball+" "+out);
		
		}
				
		sc.close();
	}
	
	public static int random() {
		return (int)(Math.random()*9)+1;
	} 
	
	public static void randomArray(int arr[]) {
		
		// for문 사용
		for(int i=0; i<arr.length; i++) {
			int r = random();
			if(!isContain(arr, r)) {
				arr[i]= r;
				} else {
					i--;
				}
		}
		
	} 
	
	public static boolean isContain(int arr[], int num) {
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		} 
		return false;
	}
} 

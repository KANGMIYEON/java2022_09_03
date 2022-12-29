package new01;

import java.util.Scanner;

public class New02 {

	public static void main(String[] args) {
		/*
		 * for문 이용하여 1~10까지 출력
		 * 1~10까지 짝수만 출력
		 * 1~10까지 3의 배수만 출력
		 * 1부터 내가 입력한 수까지 5의 배수 출력
		 * 
		 * */
		
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");				
			}
		}
		
		System.out.println();
		for(int i=1; i<=10; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");	
			}
		}
		
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int input = scan.nextInt();
		for(int i=1; i<=input; i++) {
			if(i % 5 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}

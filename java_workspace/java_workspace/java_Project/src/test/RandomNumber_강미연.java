package test;

import java.util.Scanner;

public class RandomNumber_강미연 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("난수의 개수를 입력하세요.");
		int input = scan.nextInt();
		int sum = 0;
		for(int i=1; i<=input; i++) {
			int random = (int)(Math.random()*99);
			System.out.println(random);
			sum += random;
		}
		System.out.println("난수 "+ input+"개의 합은 "+sum);
	}

}

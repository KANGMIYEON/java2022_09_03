package day03;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/*
		 * 5명의 점수를 입력받아서 배열에 저장하고,
		 * 점수의 합계와 평균 출력
		 * 합계 :
		 * 평균 :
		 * */

		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
		int sum=0;
		double avg=0;
		for(int i=0; i<score.length; i++) {
			System.out.println("점수를 입력하세요.");
			score[i]=scan.nextInt();
			sum = sum + score[i]; // sum += arr[i]
			System.out.println(score[i]);
		}
		avg = (double)sum / score.length;
		
		System.out.printf("합계 : %d%n",sum);
		System.out.printf("평균 : %.1f%n",avg); // 소수점 한자리까지 표시
		
		scan.close();
		
	}

}

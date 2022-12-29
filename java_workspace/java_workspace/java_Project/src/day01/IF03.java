package day01;

import java.util.Scanner;

public class IF03 {

	public static void main(String[] args) {
		/*
		 * 국어, 영어, 수학의 값을 입력받아 합계와 평균 출력
		 * 평균 90 이상이면 A
		 * 평균 80 이상이면 B
		 * 평균 70 이상이면 C
		 * 나머지는 D
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		int kor = scan.nextInt();
		if(kor <0 || kor >100) {
			System.out.println("잘못된 값입니다.");
		}
		System.out.println("영어 점수를 입력하세요.");
		int eng = scan.nextInt();
		if(eng <0 || eng >100) {
			System.out.println("잘못된 값입니다.");
		}
		System.out.println("수학 점수를 입력하세요.");
		int math = scan.nextInt();
		if(math <0 || math >100) {
			System.out.println("잘못된 값입니다.");
		}
		
		
		int sum = kor+eng+math;
		double avg = sum/3.0;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		// char ch;
		if(avg > 100 || avg <0) {
			System.out.println("잘못된 성적입니다.");
		} else if (avg >= 90) {
			System.out.println("등급 : A"); // ch = 'A';
		} else if (avg >= 80) {
			System.out.println("등급 : B"); // ch = 'B';
		} else if (avg >= 70) {
			System.out.println("등급 : C"); // ch= 'C';
		} else {
			System.out.println("등급 : D"); // ch= 'D';
		}
		
	}

}

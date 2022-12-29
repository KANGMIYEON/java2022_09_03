package day02;

public class For02 {

	public static void main(String[] args) {
		/*
		 * 1~10까지의 홀수 합, 짝수 합 구하기
		 * 조건 짝수/홀수 판별
		 * 홀수의 sum 짝수의 sum 별도로 작성
		 * */
		int i;
		int evenSum=0, oddSum=0;
		for(i=1; i<=10; i++) {
			if(i%2==0) {
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i;
			}
		}
		System.out.println("짝수 합 : "+evenSum); // for문을 빠져나와 출력
		System.out.println("홀수 합 : "+oddSum); // for문을 빠져나와 출력
	
		/*
		 * 구구단 2~9단 출력하기
		 * */
		
//		for(1. (i=2); 2. (i<=9); 4. (i++)) {
//			3. 실행문 for(int j=1; j<=9; j++) {
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//			System.out.println();
//		}
	}
	

}

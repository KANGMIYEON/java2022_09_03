package day15;

import java.util.Scanner;

public class SimSim {

	public static void main(String[] args) {

		// 1. String a = "a:b:c:d" ==> "a#b#c#d" 로 변환
		String a = "a:b:c:d";
		a = a.replace(":", "#");
		System.out.println(a);
		System.out.println();
		
		
		// 2. 구구단 출력
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		
		// 3. 입력 12345, 출력 1+2+3+4+5 = 총합을 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 >>");
		int input = scan.nextInt();
		int sum = 0;
		
		while(input > 0) {
			int res = input%10;
			input = input/10;
			System.out.println(res);
			sum += res;
		}
		System.out.println("합계:"+sum);
		
		// 4. out 파일에 저장되어 있는 내용을 out2로 저장
		
		// 5. int data[] = {1,2,3,4,5,6,7,8}
		// 메서드를 이용하여 합계, 평균, 최대값, 최소값 출력
		
		// 6. 1~20까지의 랜덤수 발생 후 짝수만 배열에 5개 저장 후 출력
		
		// 7. String b = "aaabbbccdeeef" 입력 => 문자의 반복횟수 출력
		// 결과 => a3b3c2d1e3f1
		
		
	}

}

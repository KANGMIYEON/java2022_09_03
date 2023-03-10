package day02;

public class 숫자문제 {

	public static void main(String[] args) {
		/*
		 * 다음과 같이 출력되도록 반복문을 작성하시오.
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * */
		
		for(int i=1; i<10; i++) {
			System.out.print(i+" ");
			if(i%3==0) {
				System.out.println();
			}
		}
		System.out.println("---------------");
		
		// count변수(임의로) 활용
		int count = 0;
		for(int i=1; i<=3; i++) { // 줄(Line)
			for(int j=1; j<=3; j++) { // 한줄에 반복 횟수
				count++; // count의 값이 1 2 3 4 .... ~
				// 3줄, 한줄에 세개씩 찍겠다!
				System.out.print(count+" ");
			}
			System.out.println();
		}

	}

}

package day02;

public class 알파벳 {

	public static void main(String[] args) {
		// char : 유니코드표에 따라 글자에 코드가 매겨져 있음.
		char ch = 'A';
		System.out.println((int)ch); // int로 형변환 해서 유니코드 65가 출력됨
		// A~Z 반복문 활용하여 표시
		System.out.println("---------------------");
		for(char ch1='A'; ch1<='Z'; ch1++) {
			// 유니코드표에 따라 값을 비교할 수 있기 때문
			System.out.print(ch1+" ");
		}
		System.out.println();
		System.out.println("---------------------");
		
		/*
		 * a
		 * ab
		 * abc
		 * abcd
		 * abcde
		 * a.............z
		 * */
		for(char i='a'; i<='z'; i++) { // 줄개수 a~z개 출력
			for(char j='a'; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("---------------------");
		
		char a=96;
		for(int i=1; i<=26; i++) { // 줄번호
			for(int j=1; j<=i; j++) { // 반복횟수
				a++; // 97번 = 'a' // count 값
				System.out.print(a);
			}
			a=96; // a가 다시 96으로 돌아가야 다음줄에서 a부터 다시 찍는거~~
			System.out.println();
		}
	}

}

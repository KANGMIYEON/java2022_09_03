package day06;

public class 숙제 {

	public static void main(String[] args) {

		solution(3, 3);
		solution(1, 3);
		solution(3, 2);
	}
	
	/*
	 * 두 정수 a,b가 주어졌을 때 a와 b 사이에 속한
	 * 모든 정수의 합을 리턴하는 메서드
	 * 매개변수 : int a, int b
	 * 리턴타입 : 합 => int
	 * 메서드명 : solution
	 * ex) a=3, b=5 => 3+4+5=리턴	작은수~큰수 더한값
	 * ex) a=5, b=1 => 1+2+3+4+5
	 * ex) a=3, b=3 => 3
	 * */
	
	public static void solution(int a, int b) {
		if(a == b) {
			System.out.println(a);
		}
		if(a < b) {
			int res = 0;
			for(int i=a; i<=b; i++) {
				res += i;
			}
			System.out.println(res);
		}
		if(a > b) {
			int res = 0;
			for(int i=b; i<=a; i++) {
				res += i;
			}
			System.out.println(res);
		}
	}
	
}

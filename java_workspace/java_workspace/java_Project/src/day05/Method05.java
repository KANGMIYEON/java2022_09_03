package day05;

public class Method05 {

	public static void main(String[] args) {

		printMulti(3);
		
	} 
	
	/*
	 * 정수를 주면 해당 단의 구구단 출력 메서드
	 * 매개변수 : ex) 2를 주면 2단 출력, 7을 주면 7단 출력
	 * 리턴타입 : 
	 * 메서드명 : printMulti
	 * */
	
	public static void printMulti(int num) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d*%d=%d", num, i, num*i);
			System.out.println();
			
		} 
	} 
	
	

}

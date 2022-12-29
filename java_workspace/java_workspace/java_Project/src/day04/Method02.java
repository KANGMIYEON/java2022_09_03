package day04;

public class Method02 {

	public static void main(String[] args) {

	int sum = 0;	
	System.out.println(isPrime(4));
	
	// 2~100의 소수를 출력
		for(int i=2; i<=100; i++) {
			if (isPrime(i)) { // true
				sum = sum + i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("--2~100까지 소수의 합계--");
		System.out.println(sum);
	
	}

	/*
	 * 기능 : 1~100까지 정수가 주어지면 이 정수가 소수인지 아닌지 판별
	 * 소수 : 1과 자기자신의 수 외에는 나누어 떨어지지 않는 수
	 * 리턴타입 : boolean
	 * 매개변수 : num1
	 * 메서드명 : k
	 * */
	
	public static boolean isPrime (int num1) {
		
		int count = 0; // 갯수를 세기 위한 변수
		for(int i=1; i<=num1 ;i++) { // i=0부터 돌리면 에러
			if(num1 % i==0) {
				count++;
			} 
		}
		if(count == 2) {
			return true;
		}
		return false;
		
	}
	
}

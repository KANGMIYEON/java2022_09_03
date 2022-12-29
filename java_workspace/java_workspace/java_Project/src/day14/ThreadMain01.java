package day14;

public class ThreadMain01 {

	public static void main(String[] args) {
		
		// Thread는 동시에 이루어지는 작업
		
		// 1. Thread 상속
		Thread01 t1 = new Thread01(); // 그대로 객체 생성 가능
		t1.start(); // 시작해라
		
		// 2. Runnable 구현
		Runnable t2 = new Thread02(); // 자체로 실행할 수 없어서
		Thread t3 = new Thread(t2); // Thread 객체를 한 번 더 만들어줘야 함
		t3.start(); // 시작해라
	}

}

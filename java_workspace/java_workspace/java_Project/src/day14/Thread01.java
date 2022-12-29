package day14;

public class Thread01 extends Thread{ // 1. Thread 상속

	@Override
	public void run() { // 반드시 run을 오버라이드 함
		for(int i=0; i<500; i++) {
			System.out.println(i+" 번째 "+getName());
		}
		System.out.println();
	
	try {
		Thread.sleep(500); // 0.5초 이후 - 해당하는 값이 너무 빨리 나오는걸 막기 위해
	}catch(Exception e) {
		e.printStackTrace();
	}

	

	}
}

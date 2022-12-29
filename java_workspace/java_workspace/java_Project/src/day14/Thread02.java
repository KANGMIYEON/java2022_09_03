package day14;

public class Thread02 implements Runnable{ // 2. Runnable 구현

	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.println(i+" 2번째 스레드");
		}
		try {
			Thread.sleep(500); // 0.5초 이후 - 해당하는 값이 너무 빨리 나오는걸 막기 위해
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

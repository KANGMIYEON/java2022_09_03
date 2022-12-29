package day14;

public class Thread03 extends Thread {
	
	// 객체 생성시 이름을 주면 스레드 이름을 set하는 생성자
	public Thread03(String name) { 
		setName(name); // 이름을 주면
	}

	@Override
	public void run() {
		for(long i=0; i<2000000000; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName()); // 가져와서 출력
	}

}

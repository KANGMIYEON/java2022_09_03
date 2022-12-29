package day14;

public class PriorityEx01 { // 우선순위

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			Thread th = new Thread03("MyThread"+i);
			th.start(); // 생성되는 우선순위는 상관없음
			if(i!=10) {
				th.setPriority(Thread.MIN_PRIORITY);
			} else {
				th.setPriority(Thread.MAX_PRIORITY);
			}
			th.start();
		}
		
	}

}

package day14;

import java.awt.*; // 멀티미디어 객체 반환

public class BeepPrintEx {

	public static void main(String[] args) {
		
		Runnable t = new BeepPrintThread();
		Thread t1 = new Thread(t);
		t1.start();
		
		
		
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		
//		// 먼저 진행 후
//		for(int i=0; i<10; i++) {
//			toolkit.beep(); // 소리
//			try {
//				Thread.sleep(500);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		
		// 나중 진행
		for(int i=0; i<10; i++) {
			System.out.println(i+" print");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

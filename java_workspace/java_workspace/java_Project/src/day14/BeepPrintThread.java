package day14;

import java.awt.Toolkit;

public class BeepPrintThread implements Runnable {
	@Override
	public void run() {
		
	// Toolkit
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	
	// 먼저 진행 후
	for(int i=0; i<10; i++) {
		toolkit.beep(); // 소리
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	}
}

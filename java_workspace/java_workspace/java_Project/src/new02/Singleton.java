package new02;

public class Singleton {


		/*
		 * < 싱글톤 패턴 > : 소프트웨어 디자인 패턴 중 하나
		 * 객체를 공유하고자 할 때 사용		 
		 * */
		
		// 단 1개만 존재해야 하는 객체의 인스턴스, static으로 선언
		private static Singleton instance;
		private int count;
		
		// 생성자를 이용한 객체 생성을 막기 위한 private 설정
		private Singleton() {};
		
		// getInstance 를 사용한 instance 반환
		public static Singleton getInstance() {
			// instance가 null일 때만 생성, 이미 생성되어 있다면 기존 instance 반환
			if(instance == null) {
				// null이면 instance 생성
				instance = new Singleton();
			}
			// null이 아니라면 기존 instance 반환
			return instance;
			
		}
		
		public int counter() {
			count++;
			return count;
		}

}



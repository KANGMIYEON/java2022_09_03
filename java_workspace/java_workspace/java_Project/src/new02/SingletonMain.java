package new02;

public class SingletonMain {

	public static void main(String[] args) {
		// 싱글톤의 객체 생성
		// Singleton s = new Singleton(); => 이렇게 불러오기 불가
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		
		if(s == s1) {
			System.out.println("s와 s1은 같은 객체입니다.");
		} else {
			System.out.println("s와 s1은 다른 객체입니다.");
		}

	}

}

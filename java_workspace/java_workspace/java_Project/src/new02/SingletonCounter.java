package new02;

class Counter{
	// 싱글톤 패턴으로 객체 만들기
	private static Counter instance;
	private int count;
	
	// private 생성자 : 생성자를 이용한 객체 생성을 막기 위한 private 설정
	private Counter() {};
	
	// getInstance()
	public static Counter getInstance() {
		if(instance == null) {
			instance = new Counter();
		}
		return instance;
	}
	
	// count()
	public int countMethod() {
		count++;
		return count;
	}
	
}

// 단 하나의 객체를 보장하기 위한 패턴
// 상속을 허용하지 않음
public class SingletonCounter {

	public static void main(String[] args) {
		
		// 객체 생성
		Counter c1 = Counter.getInstance();
		Counter c2 = Counter.getInstance();
		c1.countMethod(); // 1
		System.out.println(c1.countMethod()); // 2
		c2.countMethod(); // 3
		System.out.println(c2.countMethod()); // 4
		// c1 과 c2는 같은 객체이다.

	}

}

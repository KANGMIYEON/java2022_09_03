package day07;

public class 상속01 {

	public static void main(String[] args) {
		/*
		 * 상속 : 부모의 것을 자식에게 물려주는 것
		 * 클래스 상속 : 부모 클래스의 멤버변수와 메서드를 물려주는 것
		 * 상속을 하는 이유 : 재사용 해서 코드중복 제거
		 * 부모클래스 A 자식클래스 B
		 * class B extends A{ // A를 B에게 상속하겠다!
		 * }
		 * 상속을 받으면 부모의 멤버변수와 멤버메서드를 사용할 수 있다.
		 * - 접근제한자가 private이면 자식클래스에 접근(사용)할 수 없다.
		 * - 접근제한자 protected 
		 * 
		 * */
		
		A a = new A();
		a.setA(10);
		System.out.println(a.getA());
		System.out.println("----------");
		a.print();
		
		System.out.println("----------");
		B b = new B();
		b.setB(20);
		System.out.println(b.getB());
		b.num = 30; // protected라서 직접접근 가능
		System.out.println(b.num);
		
		System.out.println("----------");
		b.print();
		
		
	}

} 

class A{
	
	private int a,b,c; // 나만 사용
	protected int num; // 상속 가능
	
	public void print() {
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

}

class B extends A{
	
	private int d,e,f;
	
	@Override // A에서 가져온(오버라이드 한) 메서드
	public void print() {
		super.print(); // abc출력
		System.out.println("d :"+d);
		System.out.println("e :"+e);
		System.out.println("f :"+f);
	}
	
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	
}















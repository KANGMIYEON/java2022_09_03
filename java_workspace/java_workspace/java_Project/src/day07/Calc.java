package day07;

public class Calc {

	public static void main(String[] args) {
		/*
		 * 메서드 오버로딩을 이용해서 메서드 작성
		 * 메서드 오버로딩 규칙
		 * 1. 메서드의 매개변수 타입이 달라야 한다.
		 * 2. 메서드의 매개변수 개수가 달라야 한다.
		 * 리턴타입은 아무 영향을 주지 않는다.
		 * 메서드의 이름이 같아도 매개변수의 형태가 다르면 다른 메서드로 인식해서 맵핑(선택)
		 * 
		 * */
		
		// 1. 삼각형의 면적 (가로*세로/2)
		int width = 100; // 가로
		double height = 40; // 세로
		System.out.println(area(width, height));
		
		// 2. 사각형의 면적 (가로*세로)
		int w = 50; // 가로
		int h = 30; // 세로
		System.out.println(area(w, h));
		
		// 3. 원의 면적 (PI*r제곱)
		double r = 3;
		final double PI = 3.141592;
//		double PI = Math.PI;
		System.out.println(area(r, PI));
	}
	
	/*
	 * 메서드명 : area
	 * */
	
	// 1 메서드
	public static double area(int width, double height) {
		return width*height*0.5;
	}
	
	// 2 메서드
	public static int area(int w, int h) {
		return w*h;
	}
	
	// 3 메서드
	public static double area(double r, double pi) {
		return r*r*pi;
	}

}

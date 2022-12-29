package day04;

public class String01 {

	public static void main(String[] args) {
		/*
		 * String 클래스 : 문자열을 다루는 클래스
		 * String str = "Hello World";
		 * 기본 자료형처럼 사용이 가능.
		 * */
		
		String str = "Hello World";
		
		String email = "1234@gmail.com";
		email.substring(0, 3); // 시작 index 포함, 끝 index 미포함
		System.out.println(email.substring(0,4));
		
		String exe = "123.jpg";
		int position = exe.indexOf("."); // .의 위치
		
		System.out.println(position);
		System.out.println(str);
		System.out.println(str.charAt(0));
		
		String str1 = new String();
		str1 = "Hello Java";
		System.out.println(str1);
		
		if(str.equals("Hello")) {
			
		}
	}

}

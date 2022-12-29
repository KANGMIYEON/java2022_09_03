package day04;

public class String03 {

	public static void main(String[] args) {
		/* 이메일에서 ID를 추출 */
		String email = "myeonk@naver.com";
		int position = email.indexOf('@');
		System.out.println(email.substring(0, position));
		System.out.println(email.substring(position+1));
		
		String fileName = "String메서드.jpg";
		
		String name = fileName.substring(0, fileName.indexOf('.'));
		String suffix = fileName.substring(fileName.indexOf('.')+1);
		
		
//		int name = fileName.indexOf('.');
		System.out.println("파일명 : " + name);
		System.out.println("확장자 : " + suffix);

	}

}

package new01;

public class New01 {

	public static void main(String[] args) {
		
		// 홍길동의 주민등록번호는 881112-1234567이다.
		// 출력형태 : 생년월일 : 881112 , 성별 : 남
		
		String num = "881112-1234567";
		String birth = num.substring(0,6);
		char gender = num.charAt(num.indexOf("-")+1);
		String g ="";
		if(gender == '1') {
			g = "남";
		} else {
			g = "여";
		}
		
		System.out.println("생년월일 : " + birth + " , 성별 : " + g);
	}

}

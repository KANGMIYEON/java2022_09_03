package new02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkEx03 {

	public static void main(String[] args) {
		
		// 사이트에서 url 구성 정보(개발자 모드)를 BufferedReader로 읽어오기
		URL url = null;
		BufferedReader input = null;
		
		String address = "https://aire.co.kr/index.html";
		String line = ""; // 한줄씩 읽어오려고
		
		try {
			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream())); // openStream() 으로 url 열어주기
			
			while((line = input.readLine()) != null) { // 한 줄 한 줄 읽어옴
				System.out.println(line);
			}
			input.close();
		} catch (Exception e) {
			e.printStackTrace(); // 에러에 대한 값을 출력해라
		}

	}

}

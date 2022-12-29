package day14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {

	public static void main(String[] args) throws IOException{
		// 파일쓰기 
		FileOutputStream output = new FileOutputStream("out.txt"); // c드라이브에 넣어줄 수 있음~
//		String data = "test";
//		output.write("test".getBytes()); // 파일에 쓰기
//		output.close();

		// 10번 반복해서 test
		for(int i=0; i<=10; i++) {
			String data2 = i+ "test \r\n"; // \r\n: 줄바꿈
			output.write(data2.getBytes()); // 파일에 쓰기
		}
		output.close();
	}

}

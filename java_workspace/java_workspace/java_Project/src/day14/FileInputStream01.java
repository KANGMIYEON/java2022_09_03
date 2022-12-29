package day14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream01 {

	public static void main(String[] args) throws IOException {
		// 바이트 단위의 스트림.
		byte[] b = new byte[1024]; //
		FileInputStream input = new FileInputStream("out.txt");
		input.read(b);
		System.out.println(new String(b));
		input.close();
		
		
		
	}

}

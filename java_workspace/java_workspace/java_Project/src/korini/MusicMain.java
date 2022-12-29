package korini;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MusicMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		MusicManager mm = new MusicManager();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = 0;
		mm.addWholeMusic();
		while(input != 6) {
			mm.printMenu();
			System.out.println("원하는 항목의 숫자를 입력하세요.");
			input = Integer.parseInt(br.readLine());
			switch(input) {
			case 1: mm.addMusic(); break;
			case 2: mm.searchMusic(); break;
			case 3: mm.killer(); break;
			case 4: mm.fixMusic(); break;
			case 5: mm.delete(); break;
			case 6: System.out.println("See you again!"); break;
			default: System.out.println("1~6까지의 숫자를 입력해주세요.");			
			}
			
		}
		

	}

}

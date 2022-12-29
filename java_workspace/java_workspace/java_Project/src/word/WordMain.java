package word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		/* 단어장 프로그램 작성
		 * 1. 단어등록 => void addWord(Scanner scan)
		 * 2. 단어검색 => void searchWord(Scanner scan)
		 * 3. 단어수정 => void fixWord(Scanner scan)
		 * 4. 단어출력 => void printWord()
		 * 
		 * 6. 종료
		 * 
		 * 5. 파일로 저장하는 메뉴 추가
		 * 		파일명은 word.txt
		 *		apple : 사과
		 *		cat : 고양이 
		 * */
		
		WordManager wm = new WordManager();
		Scanner scan = new Scanner(System.in);
		
		int menu = -1;
		do {
			wm.printMenu();
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: wm.addWord(scan); break;
			case 2: 
				System.out.println("검색하실 단어를 입력해주세요 >>");
				wm.searchWord(scan);
				break;
			case 3: wm.fixWord(scan); break;
			case 4: wm.printWord(); break;
			case 5: wm.printFile(); break;
			case 6: break;
			default: System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
			
		} while(menu != 6);
		System.out.println("프로그램 종료!");
		scan.close();

		
	}
	
//	private static void fileWriter(ArrayList<Word> list) throws IOException{
//		Writer fs = new FileWriter("word.txt");
//		BufferedWriter bw = new BufferedWriter(fs);
//	}

}

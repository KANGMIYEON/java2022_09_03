package word;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 단어장 프로그램 작성
 * 1. 단어등록 => void addWord(Scanner scan)
 * 2. 단어검색 => void searchWord(Scanner scan)
 * 3. 단어수정 => void fixWord(Scanner scan)
 * 4. 단어출력 => void printWord()
 * 5. 종료
 * */

public class WordManager {
	
	private ArrayList<Word> list = new ArrayList<>();
	private int index;
	
	// 단어 등록
	public void addWord(Scanner scan) {
		String word = null;
		String mean = null;
		System.out.println("등록하실 단어를 입력해주세요 >>");
		word = scan.next();
		System.out.println("의미를 입력해주세요.");
		mean = scan.next();
		Word w = new Word(word, mean);
		list.add(w);
		System.out.println("단어 등록이 완료되었습니다.");
	}
	
	// 단어 검색
	public void searchWord(Scanner scan) {
		String search = null;
//		System.out.println("검색하실 단어를 입력해주세요 >>");
		search = scan.next();
		for(int i=0; i<list.size(); i++) {
			String PreWord = list.get(i).getWord();
			String PreMean = list.get(i).getMean();
			if(search.equals(PreWord)) {
				index = i;
				System.out.println(PreWord+":"+PreMean);
			}
		}
	}
	
	// 단어 수정
	public void fixWord(Scanner scan) {
		System.out.println("수정하실 단어를 입력해주세요 >> ");
		// 검색
		searchWord(scan);
		// 삭제
		list.remove(index);
		// 추가
		addWord(scan);
	}
	
	
	// 단어 출력
	public void printWord() {
		System.out.println("-----단어장-----");
		// 정렬 후 출력
		Collections.sort(list);
		for(Word tmp : list) {
			System.out.println(tmp);
		}
		
	}
	
	// menu print
	public void printMenu() {
		System.out.println("------Menu------");
		System.out.println("1.단어등록");
		System.out.println("2.단어검색");
		System.out.println("3.단어수정");
		System.out.println("4.단어출력");
		System.out.println("5.파일로저장");
		System.out.println("6.종료");
		System.out.println("----------------");
		System.out.println("원하시는 메뉴를 선택해주세요 >> ");
	}
	
	// 파일로 저장
	public void printFile() throws IOException {
		FileWriter fw = new FileWriter("word.txt");
			for(int i=0; i<list.size(); i++) {
				String word = list.get(i).getWord()+":";
				String mean = list.get(i).getMean()+" \r\n";
				fw.write(word+mean);
			}
			fw.close();
		
	}
	
	
}

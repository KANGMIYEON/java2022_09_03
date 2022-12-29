package day15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDictionary_Teacher {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		Word1 w = new Word1();
		Dictionary d = new Dictionary();
		Map<String, ArrayList<String>> words;
		words = w.makeWord(scan, d);
//		System.out.println(words);
		
		Writer fs = new FileWriter("englishWord.txt", true); // true를 쓰면 추가 가능!
		BufferedWriter bw = new BufferedWriter(fs);
		StringBuffer sb = new StringBuffer();
		int cnt = 0;
		String data = words.toString();
		sb.append(data);
		sb.append("\r\n"); // 줄바꿈용
		String english = sb.toString();
		fs.write(english);
		fs.close();
	}

}

class Dictionary{
	// 단어의 값을 가지고 있는 리스트
	ArrayList<String> word = new ArrayList<>();
}
class Word1{
	Map<String, ArrayList<String>> words = new HashMap<>();
	
	// word 추가 메서드 생성
	// 맵을 생성하여 단어를 추가하고 맵을 리턴
	public Map<String, ArrayList<String>> makeWord(Scanner scan, Dictionary d){
		Map<String, ArrayList<String>> words = new HashMap<>();
		ArrayList<String> list = new ArrayList<>(); // 의미
		// y/n
		char is = 'y';
		while(is == 'y') {
			System.out.println("단어:");
			String word = scan.next();
			if(d.word.contains(word)) {
				System.out.println("이미 있는 단어입니다.");
				is = 'n';
			} else {
				d.word.add(word); // dictionary arrayList에 단어 추가
				System.out.println("뜻:");
				scan.nextLine(); // 앞에서 입력한 Enter의 값을 가지고 휘발
				String mean = scan.nextLine(); // nextLine() : 공백포함.
				list.add(mean);
				System.out.println(word+"에 대한 내용을 추가하시겠습니까? y/n");
				is = scan.next().charAt(0);
				while(is == 'y' || is == 'Y') {
					System.out.println(word+"에 대한 뜻 추가:");
					scan.nextLine(); // 앞에서 입력한 Enter의 값을 가지고 휘발
					mean = scan.nextLine();
					list.add(mean);
					System.out.println(word+"에 대한 내용을 추가하시겠습니까? y/n");
					is = scan.next().charAt(0);
					if(!(is == 'n' || is == 'N' || is == 'y' || is == 'Y')) {
						System.out.println("잘못 입력된 값입니다.");
					}
				}
			}
			words.put(word, list);
		}
		// 뜻만 반복해서 출력
		for(String tmp : list) {
			System.out.print(tmp+" ");
		}
		return words;
	} 
}
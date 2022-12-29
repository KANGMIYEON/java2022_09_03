package day15;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class EnglishDictionary {
	/*
	 * do
	 * 1. 동사 (어떤 동작이나 행위를) 하다
	 * 2. 동사 
	 * 3. 동사
	 * 4. 조동사
	 * 5. 조동사
	 * 
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		// 단어 뜻 저장
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		ArrayList<String> meanList = new ArrayList<>();
		
		System.out.println("등록하실 단어를 입력해주세요 >>");
		String word = scan.next();
		System.out.println("의미를 입력해주세요 >>");
		String mean = scan.next();
		meanList.add(mean);
		map.put(word, meanList);
		
		while(true) {
			System.out.println("의미를 추가하시겠습니까? (y/n)");
			String input = scan.next();
			if(input.equals("y")) {
				System.out.println("추가할 의미를 입력해주세요 >>");
				String addMean = scan.next();
				meanList.add(addMean);
				
			} else if(input.equals("n")) {
				System.out.println("의미 추가를 마칩니다.");
				break;
			}
			map.put(word, meanList);
		}
		
		// Iterator도 Stream처럼 한 번만 사용 할 수 있음! 재사용 불가!
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String w = it.next();
			ArrayList<String> m = map.get(w);
			System.out.println(w);
			for(String tmp : meanList) {
				System.out.println(tmp);
			}
		}
		
		// 파일로 저장
		FileWriter fw = new FileWriter("EnglishDictionary.txt");
		
		String data = "";
		for(String tmp : map.keySet()) {
			data = tmp+":"+map.get(tmp).toString(); // Array니까 당연히 toString으로 해야한다고 성시헌이 무시함~
		}
		fw.write(data);
		fw.close();
		
			
			
			
		
	}
		

}

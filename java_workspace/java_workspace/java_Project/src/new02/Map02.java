package new02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {

		// 출력
		HashMap<String, String> map; // 메서드를 담을 map
		map = make(); // 메서드의 결과를 map에 담기
		
		// 1. Iterator
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next(); // key
			String mean = map.get(word); // value
			System.out.println("단어:" + word + ", 의미: " + mean);
		}
		
		// 2. 향상된 for문
		for(String tmp : map.keySet()) {
			System.out.println(tmp + " : " + map.get(tmp));
		}

	}
	
	// 단어:의미를 입력받아서 map으로 구성
	// 리턴 : map
	public static HashMap<String, String> make() {
		HashMap<String, String> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 >>");
		int input = scan.nextInt();
		while(map.size() < input) {
			System.out.println("단어 입력 >>");
			String word = scan.next();
			System.out.println("의미 입력 >>");
			String mean = scan.next();
			map.put(word, mean);
		}
		return map;
	}

}

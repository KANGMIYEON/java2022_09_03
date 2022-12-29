package new02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Map01 {

	public static void main(String[] args) {
		/*
		 * < 단어장 >
		 * 단어 : 의미 => hello : 안녕
		 * 입력받을 단어의 개수 받아서 그만큼 map에 추가 후 콘솔에 찍기
		 * */
		
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		
		System.out.println("숫자를 입력하세요 >>");
		int input = scan.nextInt();
		while(map.size() < input) {
			System.out.println("단어 입력 >>");
			String word = scan.next();
			System.out.println("의미 입력 >>");
			String mean = scan.next();
			map.put(word, mean);
		}
		
		// 1. Iterator 출력
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next(); // key
			String mean = map.get(word); // value
			System.out.println("단어:" + word + ", 의미: " + mean);
		}

		System.out.println("-------------");
		
		// 2. 향상된 for문 출력
		for(String tmp : map.keySet()) {
			System.out.println(tmp + " : " + map.get(tmp));
		}

	}

}

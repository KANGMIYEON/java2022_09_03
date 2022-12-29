package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx03 {

	public static void main(String[] args) {
		/*
		 * 단어장 : 단어:의미 => hello:안녕
		 * 5 => 5개의 단어 입력 / 입력받은 수 만큼 size 생성
		 * */
		
		
		// 메서드에서 호출 후 맵을 리턴받아 출력
		// 메인에서 map을 매개변수로 받아 값을 출력
		HashMap<String, String> map;
		
		map = make();
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next();
			String mean = map.get(word);
			System.out.println(word+":"+mean);
		}
		
	}
	
	/*
	 * 기능 : 단어:의미 값을 입력받아 map으로 구성하여 map을 반환
	 * 리턴타입: map HashMap<String, String>
	 * 매개변수: X
	 * 메서드명: make
	 * */
	
	public static HashMap<String, String> make(){
		
		HashMap<String, String> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("저장을 원하는 개수를 입력해주세요.");
		int size = scan.nextInt();
		
		while(map.size()<size) {
			System.out.println("단어:");
			String word = scan.next();
			System.out.println("의미:");
			String mean = scan.next();
			map.put(word, mean);
		} 
		return map;
		
		
			
		
	} 

}

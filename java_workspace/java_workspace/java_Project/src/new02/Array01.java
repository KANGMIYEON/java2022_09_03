package new02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		
		/*
		 * 컬렉션 프레임워크
		 * - List : 순서보장, 중복가능
		 * - Set : 순서보장X, 중복불가능
		 * - Map : 2가지 데이터를 쌍으로 저장, 순서보장X
		 * 		- key(중복불가능), value(중복가능)
		 * */
		
		
		
		// 리스트를 생성하고, 1부터 10까지 등록한 후 출력
		System.out.println("-----ArrayList-----");
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		for(Integer tmp : list) {
			System.out.print(tmp + " ");
		}
		list.clear(); // 리스트 비우기
		System.out.println();
		System.out.println();
		
		
		
		// 리스트 생성하고, 정수를 입력받아서 입력받은 정수만큼 오늘의 할일을 입력하고 출력
		System.out.println("-----ArrayList2-----");
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 >>");
//		int input = scan.nextInt();
//		
//		ArrayList<String> list2 = new ArrayList<>();
//		while(list2.size() < input) {
//			System.out.println("할일 입력 >>");
//			String str = scan.next(); // 할 일 입력
//			list2.add(str);
//		}
		
//		for(String tmp : list2) {
//			System.out.println(tmp);
//		}
		System.out.println();
		
		
		
		// Map을 이용하여 (이름 : 점수) 형태로 입력 (3명)
		// 해당 값을 출력
		System.out.println("-----Map-----");
		HashMap<String, Integer> map = new HashMap<>();
		map.put("미연", 90);
		map.put("지원", 80);
		map.put("성민", 70);
		map.put("시헌", 60);
		
		// 1. Iterator로 출력하기
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) { // hasNext의 결과는 boolean : true or false
			String key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		// 2. 향상된 for문으로 출력하기
		System.out.println("-------------");
		for(String tmp : map.keySet()) {
			System.out.println(tmp + " : " + map.get(tmp));
		}
		
		
		
		
		
	}

}

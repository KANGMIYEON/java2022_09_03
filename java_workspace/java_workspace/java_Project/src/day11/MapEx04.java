package day11;

import java.util.HashMap;
import java.util.Iterator;

public class MapEx04 {
		// 3번.
	static HashMap<String, Integer> map = new HashMap<>(); // static
	public static void main(String[] args) {
		
		// 1번.
//		HashMap<String, Integer> map;
//		map = make1();
		
		// 2번.
//		HashMap<String, Integer> map = new HashMap<>();
//		make2(map);
		
		// 3번.
		make3();
		
		// 4. 출력 : Iterator
		int sum = 0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String product = it.next();
			Integer price = map.get(product);
			System.out.println(product+": "+price+"원");
			sum += map.get(product);
		}
		System.out.println("합계: "+sum+"원");
		
		// 4. 출력 : 향상된 for문
//		int sum = 0;
//		for(String tmp : map.keySet()) {
//			System.out.println(tmp+":"+map.get(tmp));
//			sum += map.get(tmp);
//		}
//		System.out.println("합계: "+sum+"원");
	}

	/* 1번. 해당 맵을 메서드로 만들어서 리턴 => main에서 받아서 출력 (합계도 같이)
	 map에 상품 이름과 값을 추가 HashMap
	 map.put("가위", 2500)
	 map.put("크레파스", 5000)
	 ... */
	
	public static HashMap<String, Integer> make1(){
		HashMap<String, Integer> map = new HashMap<>();
		map.put("가위1", 2500);
		map.put("크레파스1", 5000);
		map.put("스케치북1", 3000);
		map.put("곰인형1", 10000);
		return map;
	} 
	
	/* 2번. 메인에서 map을 생성. 매개변수로 맵을 받아와서
	 상품이름과 값을 추가 */
	
	public static void make2(HashMap<String, Integer> map){
		map.put("가위2", 2500);
		map.put("크레파스2", 5000);
		map.put("스케치북2", 3000);
		map.put("곰인형2", 10000);
	}
	
	/* 3번. 멤버변수에 map을 추가 */
	
	public static void make3() {
		map.put("가위3", 2500);
		map.put("크레파스3", 5000);
		map.put("스케치북3", 3000);
		map.put("곰인형3", 10000);
	}
}

package day11;

import java.util.HashMap;
import java.util.Iterator;

public class Map02 {

	public static void main(String[] args) {
		// key/value
		// set으로 변경 후 Iterator 출력
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("국어", 89);
		map.put("영어", 78);
		map.put("수학", 84);
		System.out.println("국어:"+map.get("국어")); // key를 get 하면 value값 가져옴
		System.out.println("--------------------");
		System.out.println(map.entrySet()); // key=value 형태로 출력
		System.out.println("--------------------");
		System.out.println(map.keySet()); // key만 출력
		System.out.println(map.values()); // value만 출력
		
		// Iterator 출력 & 합계 평균
		int sum = 0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+":"+map.get(key));
			sum += map.get(key);
		}
		System.out.println("합계: "+sum);
		System.out.printf("평균: %.2f",(double)sum/map.size());

	}

}

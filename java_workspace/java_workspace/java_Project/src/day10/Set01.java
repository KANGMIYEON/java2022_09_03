package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		// Set은 순서보장 X, 중복 X
		// HashSet을 많이 사용
		// Iterator로만 출력 가능
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("apple"); // 에러는 아니지만 재저장의 개념
		set.add("peach");
		System.out.println(set);
		
		// 정렬 : set은 순서보장X, 따라서 정렬 안 됨. => set을 list로 변경한 후 정렬
		List<String> list = new ArrayList<>(set);
		Collections.sort(list); // 정렬
		System.out.println(list); // 출력

		list.sort(new Comparator<String>() { // 직접 구현

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
		System.out.println(list);
		
		// Iterator를 이용한 set 출력
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
	}

}

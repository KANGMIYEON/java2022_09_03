package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class 숙제 {

	public static void main(String[] args) {
		// int[] data = {5,6,4,2,3,1,1,2,2,4,4,6,6,7};
		// 배열의 중복을 제거하고 내림차순으로 출력
		
		// 1. Stream 사용 : 한 번 사용한 Stream은 재사용 불가!
		int[] data = {5,6,4,2,3,1,1,2,2,4,4,6,6,7};
//		int[] res = Arrays.stream(data).distinct().sorted().toArray();
		int[] resultStream = Arrays.stream(data)
				.boxed() // IntStream => Stream<Integer>로 변경
				.filter(a->a%2==0) // 짝수만 추출
				.distinct() // 중복제거
				.sorted(Comparator.reverseOrder()) // 내림차순 정렬
				.mapToInt(Integer::intValue) // Stream<Integer> => IntStream으로 변경
				.toArray(); // int[]로 변환
		for(int tmp : resultStream) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("--------------------");
		
		// 2. Set 사용 : 중복이 제거됨
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<data.length; i++) {
			if(data[i]%2==0) // 짝수만 출력
			set.add(data[i]);
		}
		System.out.println(set);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int tmp = it.next();
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("--------------------");
		
		// Set은 정렬되지 않음 => list로 변환 후 정렬
		// 역순정렬
		List<Integer> list = new ArrayList<>(set); // set을 list로 변환해서 순서값을 갖는다.
	
		// Comparator.naturalOrder() : 오름차순
		// Comparator.reverseOrder() : 내림차순
		
//		list.sort(Comparator.reverseOrder());
//		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder()); 
		for(int a : list) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		// Integer 리스트를 정수 배열로 변환
		int[] result = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			result[i] = list.get(i);
			System.out.print(result[i]+" ");
		}
		
		
		
		
		
	}

}

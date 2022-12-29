package day11;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx01 {

	public static void main(String[] args) {
		// ArrayList를 만들고 1~10까지 for문 이용해서 저장 후 출력
		// 출력구문: 1. 향상된 for문 / 2. Iterator
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=10; i++) {
			list.add(i);
		}

		// 향상된 for문 출력
		for(Integer tmp : list) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		// Iterator 출력
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer tmp = it.next();
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		Iterator it2 = list.iterator();
		while(it2.hasNext()) {
			Integer tmp2 = (Integer)it2.next();
			System.out.print(tmp2+" ");
		}
		
		// 배열에 있는 값을 list에 담기
		String[] arr1 = new String[] {"a","b","c"};
		ArrayList<String> list2 = new ArrayList<>();
		for(int i=0; i<arr1.length; i++) {
			list2.add(arr1[i]);
		}
		System.out.println();
		System.out.println(list2);
	}

}
